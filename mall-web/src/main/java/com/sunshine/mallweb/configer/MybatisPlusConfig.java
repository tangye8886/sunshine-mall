package com.sunshine.mallweb.configer;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName MybatisPlusConfig.java
 * @Description TODO
 * @createTime 2021年03月19日 23:14:00
 */
@Configuration
public class MybatisPlusConfig {

    // 最新版
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

}
