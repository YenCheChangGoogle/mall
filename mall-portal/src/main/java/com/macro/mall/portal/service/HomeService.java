package com.macro.mall.portal.service;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * 首頁內容管理Service
 * Created by macro on 2019/1/28.
 */
public interface HomeService {

    /**
     * 獲取首頁內容
     */
    HomeContentResult content();

    /**
     * 首頁商品推薦
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 獲取商品分類
     * @param parentId 0:獲取一級分類；其他：獲取指定二級分類
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根據專題分類分頁獲取專題
     * @param cateId 專題分類id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    /**
     * 分頁獲取人氣推薦商品
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 分頁獲取新品推薦商品
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);
}
