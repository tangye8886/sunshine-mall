package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.entity.ProductDetails;
import com.sunshine.mallweb.service.ProductDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品详情表(ProductDetails)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-15 22:43:11
 */
@CrossOrigin
@RestController
@RequestMapping("api/productDetails")
public class ProductDetailsController extends ApiController {

    @Resource
    private ProductDetailsService productDetailsService;

    @RespMsg
    @GetMapping(value = "selectAll")
    public Object selectAll(String productId) {
        QueryWrapper<ProductDetails> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("product_id",productId);
        queryWrapper.eq("enabled",1);
        return this.productDetailsService.getBaseMapper().selectList(queryWrapper);
    }

    @RespMsg
    @GetMapping("getProductDetailsById/{id}")
    public Object getProductDetailsById(@PathVariable Serializable id) {
        return this.productDetailsService.getById(id);
    }


    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody ProductDetails productDetails) {
        return this.productDetailsService.save(productDetails);
    }


    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody ProductDetails productDetails) {
        return this.productDetailsService.updateById(productDetails);
    }

    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productDetailsService.removeByIds(ids);
    }
}