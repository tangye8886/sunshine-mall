package com.sunshine.uaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.uaa.dao.PermissionDao;
import com.sunshine.uaa.entity.Permission;
import com.sunshine.uaa.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TPermission)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-09 23:21:09
 */
@Service("permissionService")
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements PermissionService {

    @Resource
    private PermissionDao permissionDao;


    @Override
    public List<Permission> getPermissionListByAccountId(String id) {
        return permissionDao.getPermissionListByAccountId(id);
    }
}