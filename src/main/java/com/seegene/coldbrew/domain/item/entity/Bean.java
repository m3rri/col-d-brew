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
public class Bean extends BaseEntity {
    @Id
    private Long id;
    @Column(length = 200, nullable = false)
    private String country;
    @Column(length = 200)
    private String farm;
    @Column(length = 400, name = "cup_note")
    private String cupNote;
}
