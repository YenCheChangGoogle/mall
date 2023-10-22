package com.macro.mall.service;

import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品品牌管理Service
 * Created by macro on 2018/4/26.
 */
public interface PmsBrandService {
    /**
     * 獲取所有品牌
     */
    List<PmsBrand> listAllBrand();

    /**
     * 創建品牌
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * 修改品牌
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * 刪除品牌
     */
    int deleteBrand(Long id);

    /**
     * 批量刪除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分頁查詢品牌
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * 獲取品牌詳情
     */
    PmsBrand getBrand(Long id);

    /**
     * 修改顯示狀態
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改廠家製造商狀態
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
