package com.macro.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 首頁秒殺場次信息封裝
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeFlashPromotion {
    //本場開始時間
    private Date startTime;
    //本場結束時間
    private Date endTime;
    //下場開始時間
    private Date nextStartTime;
    //下場結束時間
    private Date nextEndTime;
    //屬於該秒殺活動的商品
    private List<FlashPromotionProduct> productList;
}
