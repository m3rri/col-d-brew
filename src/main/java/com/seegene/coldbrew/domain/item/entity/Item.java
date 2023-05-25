package com.seegene.coldbrew.domain.item.entity;

import com.seegene.coldbrew.domain.common.constant.BooleanChar;
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
public class Item {
    @Id
    private Integer id;
    @Column(name = "bean_id", nullable = false)
    private Integer beanId;
    @Column(name = "shop_id", nullable = false)
    private Integer shopId;
    @Column(nullable = false)
    private Integer price;
    @Column(name = "roast_dt", nullable = false)
    private String roastDt;
    @Column(name = "purchase_dt", nullable = false)
    private String purchaseDt;
    @Column(name = "purchase_by", nullable = false)
    private Integer purchaseBy;
    @Column(name = "in_stock", nullable = false)
    private BooleanChar inStock;
}
