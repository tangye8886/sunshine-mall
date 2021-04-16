package com.sunshine.uaa.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName WebSecurityConfig.java
 * @Description TODO
 * @createTime 2021年04月10日 22:16:00
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 注入Spring 密码校验方式（加密，明文）
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 注入认证授权管理
     */
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 重写 http 配置
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login**").permitAll()
//                .antMatchers("/api/account/query").hasAuthority("SystemUserView")
//                .antMatchers("/api/account/insert").hasAuthority("SystemUserInsert")
//                .antMatchers("/api/account/update").hasAuthority("SystemUserUpdate")
//                .antMatchers("/api/account/delete").hasAuthority("SystemUserDelete")
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/oauth/check_token");
    }
}
