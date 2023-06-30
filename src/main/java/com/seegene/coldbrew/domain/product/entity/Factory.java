package com.seegene.coldbrew.domain.product.entity;

import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import com.seegene.coldbrew.domain.common.entity.User;
import com.seegene.coldbrew.domain.item.entity.Item;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factory extends BaseEntity {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", foreignKey = @ForeignKey(name = "FK_FACTORY_ITEM"))
    private Item item;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "operator", foreignKey = @ForeignKey(name = "FK_FACTORY_USER"))
    private User user;
    @Column(name = "extract_start")
    private LocalDateTime extractStart;
    @Column(name = "extract_end")
    private LocalDateTime extractEnd;
}
