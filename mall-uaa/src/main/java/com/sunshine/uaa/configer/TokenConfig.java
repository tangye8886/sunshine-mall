package com.sunshine.uaa.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import javax.annotation.Resource;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName TokenConfig.java
 * @Description TODO
 * @createTime 2021年04月10日 17:04:00
 */
@Configuration
public class TokenConfig {

    //JWT签名
    private String SIGNING_KEY = "sunshine";

    @Resource
    UserDetailsService userService;

    //使用 JWT令牌存储令牌
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGNING_KEY); //对称秘钥，资源服务器使用该秘钥来验证
        return converter;
    }

}
