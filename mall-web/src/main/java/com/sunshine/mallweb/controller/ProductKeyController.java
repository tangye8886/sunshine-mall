package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.entity.ProductKey;
import com.sunshine.mallweb.service.ProductKeyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 产品关键字(ProductKey)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-15 20:39:11
 */
@CrossOrigin
@RestController
@RequestMapping("api/productKey")
public class ProductKeyController extends ApiController {

    @Resource
    private ProductKeyService productKeyService;

    @GetMapping(value = "selectAll")
    public Object selectAll() {
        return this.productKeyService.getBaseMapper().selectList(null);
    }

    @RespMsg
    @GetMapping("getProductKey/{id}")
    public Object getProductKey(@PathVariable("id") String id) {
        return success(this.productKeyService.getById(id));
    }

    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody ProductKey productKey) {
        return this.productKeyService.save(productKey);
    }

    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody ProductKey productKey) {
        return this.productKeyService.updateById(productKey);
    }

    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productKeyService.removeByIds(ids);
    }
}