package com.seegene.coldbrew.domain.notice.repository;

import com.seegene.coldbrew.domain.notice.dto.NoticeResponse;
import com.seegene.coldbrew.domain.notice.dto.NoticeSearchRequest;
import com.seegene.coldbrew.domain.notice.entity.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NoticeRepositoryQuery {
    Page<NoticeResponse> getNoticeList(NoticeSearchRequest request, Pageable pageable);
    List<Notice> getActiveNoticeList();
}
