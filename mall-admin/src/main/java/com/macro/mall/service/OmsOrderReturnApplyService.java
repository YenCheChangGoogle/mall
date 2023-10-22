package com.macro.mall.service;

import com.macro.mall.dto.OmsOrderReturnApplyResult;
import com.macro.mall.dto.OmsReturnApplyQueryParam;
import com.macro.mall.dto.OmsUpdateStatusParam;
import com.macro.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退貨申請管理Service
 * Created by macro on 2018/10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分頁查詢申請
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量刪除申請
     */
    int delete(List<Long> ids);

    /**
     * 修改指定申請狀態
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 獲取指定申請詳情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
