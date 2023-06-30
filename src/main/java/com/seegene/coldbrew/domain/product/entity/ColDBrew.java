package com.seegene.coldbrew.domain.product.entity;

import com.seegene.coldbrew.domain.common.constant.BooleanChar;
import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColDBrew extends BaseEntity {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factory_id", foreignKey = @ForeignKey(name = "FK_COLDBREW_FACTORY"))
    private Factory factory;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "container_id", foreignKey = @ForeignKey(name = "FK_COLDBREW_CONTAINER"))
    private Container container;
    private Integer price;
    private Integer amount;
    private BooleanChar expire;
}
