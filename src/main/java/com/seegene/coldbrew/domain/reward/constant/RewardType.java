package com.seegene.coldbrew.domain.reward.constant;

import lombok.Getter;

@Getter
public enum RewardType {
    DISCOUNT_CHARGE("정산 금액 할인"),
    ITEM_DRIPBACK("드립백"),
    ;

    private String title;

    RewardType(String title){
        this.title = title;
    }
}
