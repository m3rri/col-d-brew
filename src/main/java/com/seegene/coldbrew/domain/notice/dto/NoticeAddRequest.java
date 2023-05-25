package com.seegene.coldbrew.domain.notice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeAddRequest {
    private String title;
    @NotEmpty
    private String content;
    @NotEmpty
    private String startDt;
    @NotEmpty
    private String endDt;
}
