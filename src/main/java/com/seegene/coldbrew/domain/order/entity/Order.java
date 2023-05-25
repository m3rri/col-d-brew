package com.seegene.coldbrew.domain.order.entity;

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
public class Order extends BaseEntity {
    @Id
    private Integer id;
    @Column(name = "coldbrew_id")
    private Integer coldbrewId;
    private Integer quantity;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "order_dt")
    private String orderDt;
}
