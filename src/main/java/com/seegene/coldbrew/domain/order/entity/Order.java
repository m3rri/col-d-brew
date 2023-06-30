package com.seegene.coldbrew.domain.order.entity;

import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import com.seegene.coldbrew.domain.common.entity.User;
import com.seegene.coldbrew.domain.product.entity.ColDBrew;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coldbrew_id", foreignKey = @ForeignKey(name = "FK_ORDER_COLDBREW"))
    private ColDBrew colDBrew;
    private Integer quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_ORDER_USER"))
    private User user;
    @Column(name = "order_dt")
    private String orderDt;
}
