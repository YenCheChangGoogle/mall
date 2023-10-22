package com.macro.mall.dao;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 後台角色管理自定義Dao
 * Created by macro on 2020/2/2.
 */
public interface UmsRoleDao {
    /**
     * 根據後台用戶ID獲取菜單
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根據角色ID獲取菜單
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根據角色ID獲取資源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
