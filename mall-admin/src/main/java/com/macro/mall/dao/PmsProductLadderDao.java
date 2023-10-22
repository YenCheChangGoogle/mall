package com.macro.mall.dao;

import com.macro.mall.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 會員階梯價格自定義Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductLadderDao {
    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
