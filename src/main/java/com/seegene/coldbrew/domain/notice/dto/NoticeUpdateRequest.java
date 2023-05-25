package com.seegene.coldbrew.domain.notice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeUpdateRequest extends NoticeAddRequest{
    @NotNull
    private Integer id;
}
