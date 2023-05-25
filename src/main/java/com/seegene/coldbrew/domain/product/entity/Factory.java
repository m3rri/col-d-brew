package com.seegene.coldbrew.domain.product.entity;

import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factory extends BaseEntity {
    @Id
    private Integer id;
    @Column(name = "item_id")
    private Integer itemId;
    private Integer operator;
    @Column(name = "extract_start")
    private LocalDateTime extractStart;
    @Column(name = "extract_end")
    private LocalDateTime extractEnd;

    @Column(name = "container_id")
    private Integer containerId;
    private Integer surplus;
}
