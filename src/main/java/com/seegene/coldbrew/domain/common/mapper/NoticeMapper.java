package com.seegene.coldbrew.domain.common.mapper;

import com.seegene.coldbrew.domain.notice.dto.NoticeAddRequest;
import com.seegene.coldbrew.domain.notice.dto.NoticeResponse;
import com.seegene.coldbrew.domain.notice.entity.Notice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NoticeMapper {
    NoticeMapper INSTANCE = Mappers.getMapper(NoticeMapper.class);

    Notice toNotice(NoticeAddRequest request);
    NoticeResponse toNoticeResponse(Notice notice);
    List<NoticeResponse> toNoticeResponseList(List<Notice> notices);
}
