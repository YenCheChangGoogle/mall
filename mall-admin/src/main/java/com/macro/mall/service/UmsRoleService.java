package com.macro.mall.service;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 後台角色管理Service
 * Created by macro on 2018/9/30.
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量刪除角色
     */
    int delete(List<Long> ids);

    /**
     * 獲取所有角色列表
     */
    List<UmsRole> list();

    /**
     * 分頁獲取角色列表
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根據管理員ID獲取對應菜單
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 獲取角色相關菜單
     */
    List<UmsMenu> listMenu(Long roleId);

    /**
     * 獲取角色相關資源
     */
    List<UmsResource> listResource(Long roleId);

    /**
     * 給角色分配菜單
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 給角色分配資源
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);
}
