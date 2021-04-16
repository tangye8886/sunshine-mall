package com.sunshine.uaa.configer;

import com.sunshine.uaa.dao.AccountDao;
import com.sunshine.uaa.dao.PermissionDao;
import com.sunshine.uaa.entity.Account;
import com.sunshine.uaa.entity.Permission;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName UserDetailsServiceImpl.java
 * @Description TODO
 * @createTime 2021年04月10日 22:14:00
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    AccountDao accountDao;

    @Resource
    PermissionDao permissionDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountDao.getAccountByLoginName(username);
        if(account==null) return null;
        List<Permission> permissionList = this.permissionDao.getPermissionListByAccountId(account.getId());
        List<String> codeList = permissionList.stream().map(obj -> obj.getCode()).collect(Collectors.toList());
        String[] permissionArray = codeList.toArray(new String[codeList.size()]);
        UserDetails userDetails = User.withUsername(account.getLoginName()).password(account.getPassword()).authorities(permissionArray).build();
        return userDetails;
    }
}
