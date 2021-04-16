package com.sunshine.mallweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.entity.ProductLove;
import com.sunshine.mallweb.service.ProductInfoService;
import com.sunshine.mallweb.service.ProductLoveService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 收藏详情表(ProductLove)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-15 19:36:39
 */
@CrossOrigin
@RestController
@RequestMapping("api/productLove")
public class ProductLoveController extends ApiController {

    @Resource
    private ProductLoveService productLoveService;

    @Resource
    private ProductInfoService productInfoService;


    @RespMsg
    @GetMapping(value = "getLoveListByAccountId" )
    public Object getLoveListByAccountId() {
        QueryWrapper<ProductLove> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("account_id","admin");
        List<ProductInfo> productInfos = this.productInfoService.getBaseMapper().selectList(null);
        List<ProductLove> productLoves = this.productLoveService.getBaseMapper().selectList(queryWrapper);
        for(ProductLove love:productLoves){
            List<ProductInfo> collect = productInfos.stream().filter(obj -> StringUtils.equals(obj.getId(), love.getProductId())).collect(Collectors.toList());
            if(!CollectionUtils.isEmpty(collect)){
                love.setProductInfo(collect.get(0));
            }
        }
        return productLoves;
    }


    @RespMsg
    @GetMapping("getLoveById/{id}")
    public Object selectOne(@PathVariable Serializable id) {
        return this.productLoveService.getById(id);
    }


    @RespMsg
    @PostMapping(value = "insert" )
    public Object insert(@RequestBody ProductLove productLove) {
        QueryWrapper<ProductLove> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("account_id","admin");
        queryWrapper.eq("product_id",productLove.getProductId());
        List<ProductLove> productLoves = this.productLoveService.getBaseMapper().selectList(queryWrapper);
        if(CollectionUtils.isEmpty(productLoves))
        {
            productLove.setAccountId("admin");
            this.productLoveService.save(productLove);
        }
        return true;
    }


    @RespMsg
    @PutMapping(value = "update" )
    public Object update(@RequestBody ProductLove productLove) {
        return this.productLoveService.updateById(productLove);
    }


    @RespMsg
    @DeleteMapping(value = "delete" )
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productLoveService.removeByIds(ids);
    }
}