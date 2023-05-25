package com.seegene.coldbrew.domain.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="common_code")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCode {
    @Id
    private String code;
    @Column(name = "category_code", nullable = false)
    private String categoryCode;
    @Column(length = 45, nullable = false)
    private String name;
}
