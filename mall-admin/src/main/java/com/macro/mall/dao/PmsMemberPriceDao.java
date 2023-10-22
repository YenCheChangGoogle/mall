package com.macro.mall.dao;

import com.macro.mall.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 會員價格管理自定義Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsMemberPriceDao {
    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
