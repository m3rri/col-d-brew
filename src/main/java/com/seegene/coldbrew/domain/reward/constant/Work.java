package com.seegene.coldbrew.domain.reward.constant;

import lombok.Getter;

@Getter
public enum Work {
    FACTORY_OPERATING("원액 추출"),
    FACTORY_CLEAN("원액 보관 및 설거지"),
    PURCHASE_ITEM("원두 구매"),
    ;

    private String title;

    Work(String title){
        this.title = title;
    }
}
