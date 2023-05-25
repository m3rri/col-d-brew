package com.seegene.coldbrew.domain.common.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="common_category")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCategory {
    @Id
    private String code;
    @Column(length = 45, nullable = false)
    private String name;
}
