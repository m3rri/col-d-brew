package com.seegene.coldbrew.domain.item.entity;

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
public class Shop extends BaseEntity {
    @Id
    private Integer id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 1000)
    private String location;
}
