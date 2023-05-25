package com.seegene.coldbrew.domain.notice.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.seegene.coldbrew.domain.common.mapper.NoticeMapper;
import com.seegene.coldbrew.domain.notice.dto.NoticeResponse;
import com.seegene.coldbrew.domain.notice.dto.NoticeSearchRequest;
import com.seegene.coldbrew.domain.notice.entity.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.support.PageableExecutionUtils;

import java.time.LocalDate;
import java.util.List;

import static com.seegene.coldbrew.domain.notice.entity.QNotice.notice;

public class NoticeRepositoryQueryImpl extends QuerydslRepositorySupport implements NoticeRepositoryQuery {
    final JPAQueryFactory jpaQueryFactory;
    private NoticeMapper noticeMapper = NoticeMapper.INSTANCE;

    public NoticeRepositoryQueryImpl(JPAQueryFactory jpaQueryFactory){
        super(Notice.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public Page<NoticeResponse> getNoticeList(NoticeSearchRequest request, Pageable pageable) {
        String keyword = request.getKeyword();
        BooleanExpression whereClause = notice.startDt.goe(request.getStartDt())
                .and(notice.endDt.loe(request.getEndDt()));

        if(keyword!=null && keyword.length()>0){
            whereClause = switch (request.getKeywordType()){
                case ALL-> whereClause.and(notice.title.like(keyword)
                            .or(notice.contents.like(keyword)));
                case TITLE-> whereClause.and(notice.title.like(keyword));
                default-> whereClause.and(notice.contents.like(keyword));
            };
        }

        JPAQuery<Long> totalCount = jpaQueryFactory
                .select(notice.count())
                .where(whereClause);

        List<Notice> content = jpaQueryFactory
                .selectFrom(notice)
                .where(whereClause)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .orderBy(notice.createdDt.desc())
                .fetch();

        return PageableExecutionUtils.getPage(
                noticeMapper.toNoticeResponseList(content),
                pageable,
                ()->totalCount.fetchOne()
        );
    }

    public List<Notice> getActiveNoticeList(){
        LocalDate date = LocalDate.now();
        String toDay = String.format("", date.getYear(), date.getMonth(), date.getDayOfMonth());

        return jpaQueryFactory
                .selectFrom(notice)
                .where(notice.startDt.goe(toDay)
                  .and(notice.endDt.loe(toDay)))
                .fetch();
    }

}
