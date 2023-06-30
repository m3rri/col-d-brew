package com.seegene.coldbrew.domain.item.entity;

import com.seegene.coldbrew.domain.common.constant.BooleanChar;
import com.seegene.coldbrew.domain.common.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bean_id", foreignKey = @ForeignKey(name = "FK_ITEM_BEAN"))
    private Bean bean;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id", foreignKey = @ForeignKey(name = "FK_ITEM_SHOP"))
    private Shop shop;
    @Column(nullable = false)
    private Integer price;
    @Column(name = "roast_dt", nullable = false)
    private String roastDt;
    @Column(name = "purchase_dt", nullable = false)
    private String purchaseDt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_by", foreignKey = @ForeignKey(name = "FK_ITEM_USER"))
    private User user;
    @Column(name = "in_stock", nullable = false)
    private BooleanChar inStock;
}
