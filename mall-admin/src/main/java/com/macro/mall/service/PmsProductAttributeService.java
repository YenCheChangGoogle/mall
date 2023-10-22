package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeParam;
import com.macro.mall.dto.ProductAttrInfo;
import com.macro.mall.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品屬性管理Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeService {
    /**
     * 根據分類分頁獲取商品屬性
     * @param cid 分類id
     * @param type 0->規格；1->參數
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品屬性
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品屬性
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 獲取單個商品屬性信息
     */
    PmsProductAttribute getItem(Long id);

    /**
     * 批量刪除商品屬性
     */
    @Transactional
    int delete(List<Long> ids);

    /**
     * 獲取商品分類對應屬性列表
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
