package com.seegene.coldbrew.domain.reword.entity;

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
public class Reword extends BaseEntity {
    @Id
    private Integer id;
    @Column(name = "work_code")
    private String workCode;
    @Column(name = "reword_code")
    private String rewordCode;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "work_dt")
    private String wordDt;
}
