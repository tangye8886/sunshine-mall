package com.sunshine.uaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.uaa.dao.AccountDao;
import com.sunshine.uaa.entity.Account;
import com.sunshine.uaa.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * (TUser)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-09 23:20:47
 */
@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {

}