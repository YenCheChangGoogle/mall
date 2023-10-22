package com.macro.mall.service;

import com.macro.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * 會員等級管理Service
 * Created by macro on 2018/4/26.
 */
public interface UmsMemberLevelService {
    /**
     * 獲取所有會員等級
     * @param defaultStatus 是否為默認會員
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
