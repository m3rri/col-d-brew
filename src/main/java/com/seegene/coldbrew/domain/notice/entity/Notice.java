package com.seegene.coldbrew.domain.notice.entity;

import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import com.seegene.coldbrew.domain.notice.dto.NoticeUpdateRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Notice extends BaseEntity {
    @Id
    private Integer id;
    @Column(length = 99)
    private String title;
    @Column(length = 300, nullable = false)
    private String contents;
    @Column(name="start_dt", nullable = false)
    private String startDt;
    @Column(name="end_dt", nullable = false)
    private String endDt;

    public Notice updateFromRequest(NoticeUpdateRequest request){
        if(request.getTitle() != null){
            this.setTitle(request.getTitle());
        }

        if(request.getContent() != null){
            this.setContents(request.getContent());
        }

        if(request.getStartDt() != null){
            this.setStartDt(request.getStartDt());
        }

        if(request.getEndDt() != null){
            this.setEndDt(request.getEndDt());
        }

        return this;
    }
}
