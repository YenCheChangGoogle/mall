package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 會員瀏覽記錄管理Service
 * Created by macro on 2018/8/3.
 */
public interface MemberReadHistoryService {
    /**
     * 生成瀏覽記錄
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量刪除瀏覽記錄
     */
    int delete(List<String> ids);

    /**
     * 分頁獲取用戶瀏覽歷史記錄
     */
    Page<MemberReadHistory> list(Integer pageNum, Integer pageSize);

    /**
     * 清空瀏覽記錄
     */
    void clear();
}
