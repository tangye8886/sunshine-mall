package com.sunshine.mallweb.configer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

import javax.annotation.Resource;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName ResourceServerConfiguration.java
 * @Description TODO
 * @createTime 2021年04月10日 22:33:00
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    public static final String RESOURCE_ID = "resource";

    @Resource
    TokenStore tokenStore;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(RESOURCE_ID)//资源 id
                .tokenStore(tokenStore)
//                .tokenServices(tokenService())//验证令牌的服务
                .stateless(true);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/api/productInfo/search").hasAuthority("SystemUserView")
//                .antMatchers("/api/account/getAccount").hasAuthority("SystemUserView")
//                .antMatchers("/api/account/insert").hasAuthority("SystemUserInsert")
//                .antMatchers("/api/account/update").hasAuthority("SystemUserUpdate")
//                .antMatchers("/api/account/delete").hasAuthority("SystemUserDelete")
//                .antMatchers("/api/contract/**").hasAuthority("SystemContractAdmin")
//                .antMatchers("/api/dept/**").hasAuthority("SystemDeptAdmin")
//                .antMatchers("/api/jobs/**").hasAuthority("SystemJobsAdmin")
//                .antMatchers("/api/role/**").hasAuthority("SystemRoleAdmin")
//                .antMatchers("/api/menu/**").hasAuthority("SystemMenuAdmin")
//                .antMatchers("/api/permission/**").hasAuthority("SystemPermissionAdmin")
                .anyRequest().permitAll();
    }

}
