package com.sunshine.mallweb.common;

import java.lang.annotation.*;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName RespMsg.java
 * @Description 自定义注解
 * @createTime 2020年10月06日 19:32:00
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RespMsg {
}
