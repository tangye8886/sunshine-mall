package com.sunshine.uaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.uaa.entity.Permission;

import java.util.List;

/**
 * (TPermission)表服务接口
 *
 * @author tanghongtao
 * @since 2021-04-09 23:21:09
 */
public interface PermissionService extends IService<Permission> {

    List<Permission> getPermissionListByAccountId(String id);

}