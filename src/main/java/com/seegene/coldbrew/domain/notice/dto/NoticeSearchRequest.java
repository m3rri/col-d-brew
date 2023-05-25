package com.seegene.coldbrew.domain.notice.dto;

import com.seegene.coldbrew.domain.notice.constant.KeywordType;
import com.seegene.coldbrew.global.util.StringUtils;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class NoticeSearchRequest {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSS");
    private KeywordType keywordType;
    private String keyword;
    @NotEmpty
    @Pattern(regexp = "(\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]))|.{0}")
    private String startDt;
    @NotEmpty
    @Pattern(regexp = "(\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]))|.{0}")
    private String endDt;

    public LocalDateTime toLocalDateTimeSDate(){
        if(StringUtils.isNull(this.startDt)){
            return null;
        }else{
            return LocalDateTime.parse(this.startDt+" 00:00:00.00000", formatter);
        }
    }

    public LocalDateTime toLocalDateTimeEDate(){
        if(StringUtils.isNull(this.endDt)){
            return null;
        }else{
            return LocalDateTime.parse(this.endDt+" 23:59:59.99999", formatter);
        }
    }
}
