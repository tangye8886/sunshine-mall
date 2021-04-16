package com.sunshine.uaa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunshine.uaa.entity.Permission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (TPermission)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-09 23:21:09
 */
public interface PermissionDao extends BaseMapper<Permission> {


    @Select("select DISTINCT p.* from t_role_permission as rp,t_permission as p where rp.permission_id = p.id AND p.`status` = 1  and rp.role_id in (select r.id from t_account_role as ar,t_role as r where ar.role_id = r.id and ar.user_id = #{id}) ")
    List<Permission> getPermissionListByAccountId(@Param("id") String id);

}