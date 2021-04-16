package com.sunshine.uaa.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Arrays;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName MyAuthorizationServer.java
 * @Description TODO 自定义认证授权服务
 * @createTime 2021年04月10日 17:07:00
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {

    @Resource
    private TokenStore tokenStore;

    @Resource
    private ClientDetailsService clientDetailsService;

    @Resource
    private AuthorizationCodeServices authorizationCodeServices;

    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private  JwtAccessTokenConverter jwtAccessTokenConverter;

    @Resource
    private PasswordEncoder passwordEncoder;

    //将客户端详情信息存储到数据库
    @Bean
    public ClientDetailsService clientDetailsService(DataSource dataSource) {
        ClientDetailsService clientDetailsService = new JdbcClientDetailsService(dataSource);
        ((JdbcClientDetailsService) clientDetailsService).setPasswordEncoder(passwordEncoder);
        return clientDetailsService;
    }


    //客户端详情配置（配置客户端的信息，客户端（浏览器）密钥一致才可以访问）
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

        //保存在数据库中
        clients.withClientDetails(clientDetailsService);

        //保存在内存中
//        clients.inMemory()
//                .withClient("c1")
//                .secret(new BCryptPasswordEncoder().encode("secret"))
//                .resourceIds("res1")
//                .authorizedGrantTypes("authorization_code", "password","client_credentials","implicit","refresh_token")// 该client允许的授权类型authorization_code,password,refresh_token,implicit,client_credentials
//                .scopes("all")// 允许的授权范围
//                .autoApprove(false)//false跳转到授权页面
//                .redirectUris("http://www.baidu.com")  //加上验证成功回调地址
//        ;
    }


    //认证授权服务令牌解析服务
    @Bean
    public AuthorizationServerTokenServices tokenService() {
        DefaultTokenServices service = new DefaultTokenServices();
        service = new DefaultTokenServices();
        service.setClientDetailsService(clientDetailsService);
        service.setSupportRefreshToken(true);//支持刷新令牌
        service.setTokenStore(tokenStore); //令牌存储策略

        //令牌增强（JWT模式下才需要，普通模式不用）
        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(jwtAccessTokenConverter));
        service.setTokenEnhancer(tokenEnhancerChain);

        service.setRefreshTokenValiditySeconds(259200);//刷新令牌默认有效期3天
        service.setAccessTokenValiditySeconds(7200);//令牌默认有效期2小时

        return  service;
    }


    //授权服务端点配置
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .authenticationManager(authenticationManager)//认证管理器
                .authorizationCodeServices(authorizationCodeServices)//授权码服务
                .tokenServices(tokenService())//令牌管理服务
                .allowedTokenEndpointRequestMethods(HttpMethod.POST);  //允许POST 请求
    }


    //设置授权码模式的授权码如何存取，采用数据库方式存储
    @Bean
    public AuthorizationCodeServices authorizationCodeServices(DataSource dataSource) {
        return new JdbcAuthorizationCodeServices(dataSource);//设置授权码模式的授权码如何存取
    }

    //设置授权码模式的授权码如何存取，暂时采用内存方式
 /*   @Bean
    public AuthorizationCodeServices authorizationCodeServices()
    {
        return new InMemoryAuthorizationCodeServices();
    }*/

    //授权服务端点的安全约束 策略
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()")  //允许所有访问
                .checkTokenAccess("permitAll()")//允许所有访问
                .allowFormAuthenticationForClients();//允许所有访问
    }
}
