package com.sunshine.uaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan("com.sunshine.uaa.dao")
@SpringBootApplication
public class UaaApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UaaApp.class,args);
    }
}
