package com.seegene.coldbrew.domain.notice.controller;

import com.seegene.coldbrew.domain.notice.dto.NoticeResponse;
import com.seegene.coldbrew.domain.notice.dto.NoticeSearchRequest;
import com.seegene.coldbrew.domain.notice.service.NoticeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("")
    public Page<NoticeResponse> getNoticeList(
            @Valid NoticeSearchRequest request,
            @PageableDefault(size = 10) Pageable pageable
    ){
        return noticeService.getNoticeList(request, pageable);
    }

    @GetMapping("/active")
    public List<NoticeResponse> getActiveNoticeList(){
        return noticeService.getActiveNoticeList();
    }
}
