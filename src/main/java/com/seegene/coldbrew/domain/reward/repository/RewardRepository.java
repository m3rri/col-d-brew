package com.seegene.coldbrew.domain.reward.repository;

import com.seegene.coldbrew.domain.reward.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
}
