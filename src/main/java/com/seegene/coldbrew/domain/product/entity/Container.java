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
public class Container extends BaseEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    @Column(name = "color_code")
    private String colorCode;
    @Column(name = "volume_code")
    private String volumeCode;
    @Column(name = "in_use")
    private BooleanChar inUse;
}
