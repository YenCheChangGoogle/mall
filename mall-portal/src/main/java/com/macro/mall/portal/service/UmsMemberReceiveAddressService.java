package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMemberReceiveAddress;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用戶地址管理Service
 * Created by macro on 2018/8/28.
 */
public interface UmsMemberReceiveAddressService {
    /**
     * 添加收貨地址
     */
    int add(UmsMemberReceiveAddress address);

    /**
     * 刪除收貨地址
     * @param id 地址表的id
     */
    int delete(Long id);

    /**
     * 修改收貨地址
     * @param id 地址表的id
     * @param address 修改的收貨地址信息
     */
    @Transactional
    int update(Long id, UmsMemberReceiveAddress address);

    /**
     * 返回當前用戶的收貨地址
     */
    List<UmsMemberReceiveAddress> list();

    /**
     * 獲取地址詳情
     * @param id 地址id
     */
    UmsMemberReceiveAddress getItem(Long id);
}
