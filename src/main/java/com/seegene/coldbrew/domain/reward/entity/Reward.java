package com.seegene.coldbrew.domain.reward.entity;

import com.seegene.coldbrew.domain.reward.constant.RewardType;
import com.seegene.coldbrew.domain.reward.constant.Work;
import com.seegene.coldbrew.domain.common.entity.BaseEntity;
import com.seegene.coldbrew.domain.common.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reward extends BaseEntity {
    @Id
    private Long id;
    @Column(name = "work")
    private Work work;
    @Column(name = "reward_type")
    private RewardType rewardType;
    @Column(name = "reward_price")
    private Integer rewardPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_REWORD_USER"))
    private User user;
    @Column(name = "work_dt")
    private String wordDt;
}
