package com.sunshine.mallweb.controller;

import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.service.ProductInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description TODO
 * @createTime 2021年04月13日 21:45:00
 */
@Controller
public class IndexController {

    @Resource
    ProductInfoService productInfoService;

    @RequestMapping("/index")
    public String index(Model model){
        List<ProductInfo> productInfos = productInfoService.getBaseMapper().selectList(null);
        model.addAttribute("productInfos",productInfos);
        return "index";
    }
}
