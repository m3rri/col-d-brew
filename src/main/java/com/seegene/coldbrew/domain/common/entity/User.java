package com.seegene.coldbrew.domain.common.entity;

import com.seegene.coldbrew.domain.common.constant.BooleanChar;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    @Column(length = 200, nullable = false, columnDefinition = "email")
    private String email;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(nullable = false)
    private BooleanChar admin;
    @CreatedDate
    @Column(name = "created_dt", updatable = false, nullable = false)
    private LocalDateTime createdDt;
    @Column(name = "last_access_dt", nullable = false)
    private LocalDateTime lastAccessDt;
    @Column(nullable = false)
    private BooleanChar expire;
}
