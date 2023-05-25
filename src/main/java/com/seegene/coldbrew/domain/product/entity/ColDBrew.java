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
public class ColDBrew extends BaseEntity {
    @Id
    private Integer id;
    @Column(name = "factory_id")
    private Integer factoryId;
    private Integer price;
    private Integer amount;
    private BooleanChar expire;
}
