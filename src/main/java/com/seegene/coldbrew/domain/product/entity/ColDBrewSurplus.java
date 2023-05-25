package com.seegene.coldbrew.domain.product.entity;

import com.seegene.coldbrew.domain.common.constant.BooleanChar;
import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColDBrewSurplus extends BaseEntity {
    @Id
    private Integer id;
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "container_id")
    private Integer containerId;
    @Column(name = "user_id")
    private Integer userId;
    private BooleanChar expire;
}
