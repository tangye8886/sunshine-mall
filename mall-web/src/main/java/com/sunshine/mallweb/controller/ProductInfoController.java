package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.service.ProductInfoService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ProductInfo)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:14
 */
@CrossOrigin
@RestController
@RequestMapping("api/productInfo")
public class ProductInfoController extends ApiController {

    @Resource
    private ProductInfoService productInfoService;


    @RespMsg
    @PostMapping(value = "search")
    public Object search(@RequestBody ProductInfoDTO productInfo) {
        Page<ProductInfo> page =new Page<>();
        page.setSize(productInfo.getSize());
        page.setCurrent(productInfo.getCurrent());
        return this.productInfoService.getProductInfoListByConditionPage(page,productInfo);
    }

    @RespMsg
    @GetMapping(value = "getProductInfoById/{id}")
    public Object getProductInfoById(@PathVariable("id") String id) {
        return this.productInfoService.getProductInfoById(id);
    }

    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody ProductInfo productInfo) {
        return this.productInfoService.save(productInfo);
    }

    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody ProductInfo productInfo) {
        return this.productInfoService.updateById(productInfo);
    }

    @RespMsg
    @GetMapping(value = "test")
    public Object test() {
        Object principal = SecurityContextHolder.getContext().getAuthentication();
        return principal;
    }


    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productInfoService.removeByIds(ids);
    }
}