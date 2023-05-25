package com.seegene.coldbrew.domain.notice.service;

import com.seegene.coldbrew.domain.common.mapper.NoticeMapper;
import com.seegene.coldbrew.domain.notice.dto.NoticeAddRequest;
import com.seegene.coldbrew.domain.notice.dto.NoticeResponse;
import com.seegene.coldbrew.domain.notice.dto.NoticeSearchRequest;
import com.seegene.coldbrew.domain.notice.dto.NoticeUpdateRequest;
import com.seegene.coldbrew.domain.notice.entity.Notice;
import com.seegene.coldbrew.domain.notice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    private NoticeMapper noticeMapper = NoticeMapper.INSTANCE;

    public Page<NoticeResponse> getNoticeList(NoticeSearchRequest request, Pageable pageable){
        return noticeRepository.getNoticeList(request, pageable);
    }

    public List<NoticeResponse> getActiveNoticeList(){
        List<Notice> list = noticeRepository.getActiveNoticeList();

        return noticeMapper.toNoticeResponseList(list);
    }

    public NoticeResponse getNotice(Integer noticeId){
        Optional<Notice> notice = noticeRepository.findById(noticeId);

        return noticeMapper.toNoticeResponse(notice.orElse(null));
    }

    public Integer addNotice(NoticeAddRequest request){
        Notice notice = noticeMapper.toNotice(request);

        return noticeRepository.save(notice).getId();
    }

    public Integer updateNotice(NoticeUpdateRequest request){
        Optional<Notice> noticeOption = noticeRepository.findById(request.getId());

        if(noticeOption.isPresent()){
            Notice notice = noticeOption.get();
            notice = notice.updateFromRequest(request);

            return noticeRepository.save(notice).getId();
        }else{
            return 0;
        }
    }

    public void deleteNotice(Integer noticeId){
        noticeRepository.deleteById(noticeId);
    }
}
