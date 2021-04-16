package com.sunshine.mallweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName MallWebApp.java
 * @Description TODO
 * @createTime 2021年04月13日 21:45:00
 */
@MapperScan("com.sunshine.mallweb.dao")
@SpringBootApplication
public class MallWebApp {
    public static void main(String[] args) {
        SpringApplication.run(MallWebApp.class,args);
    }
}
