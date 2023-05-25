package com.seegene.coldbrew.domain.notice.controller;

import com.seegene.coldbrew.domain.notice.dto.NoticeAddRequest;
import com.seegene.coldbrew.domain.notice.dto.NoticeUpdateRequest;
import com.seegene.coldbrew.domain.notice.service.NoticeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/notice")
@RequiredArgsConstructor
public class AdminNoticeController {
    private final NoticeService noticeService;

    @PostMapping("")
    public Integer addNotice(@Valid NoticeAddRequest request){
        return noticeService.addNotice(request);
    }

    @PutMapping("")
    public Integer updateNotice(@Valid NoticeUpdateRequest request){
        return noticeService.updateNotice(request);
    }

    @DeleteMapping("")
    public void deleteNotice(Integer noticeId){
        noticeService.deleteNotice(noticeId);
    }

}
