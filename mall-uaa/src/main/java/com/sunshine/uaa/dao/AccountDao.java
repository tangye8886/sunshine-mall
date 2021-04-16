package com.sunshine.uaa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunshine.uaa.entity.Account;
import org.apache.ibatis.annotations.Select;

/**
 * (Account)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-09 23:20:47
 */
public interface AccountDao extends BaseMapper<Account> {

    @Select("select * from t_account where login_name = #{loginName} and enabled=1 ")
    Account getAccountByLoginName(String loginName);
}