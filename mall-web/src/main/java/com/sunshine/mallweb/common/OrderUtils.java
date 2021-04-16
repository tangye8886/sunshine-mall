package com.sunshine.mallweb.common;

import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.commons.lang3.*;
/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName OrderUtils.java
 * @Description TODO
 * @createTime 2021年04月14日 22:22:00
 */
public class OrderUtils {

    public static String makeOrderNo(){
        String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String random = RandomStringUtils.randomNumeric(8);
        return time + random;
    }

}
