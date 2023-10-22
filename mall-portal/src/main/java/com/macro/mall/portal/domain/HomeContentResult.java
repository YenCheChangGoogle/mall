package com.macro.mall.portal.domain;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 首頁內容返回信息封裝
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeContentResult {
    //輪播廣告
    private List<SmsHomeAdvertise> advertiseList;
    //推薦品牌
    private List<PmsBrand> brandList;
    //當前秒殺場次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推薦
    private List<PmsProduct> newProductList;
    //人氣推薦
    private List<PmsProduct> hotProductList;
    //推薦專題
    private List<CmsSubject> subjectList;
}
