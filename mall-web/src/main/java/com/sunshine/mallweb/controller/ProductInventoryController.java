package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.entity.ProductInventory;
import com.sunshine.mallweb.service.ProductInventoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 库存表(ProductInventory)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:28
 */
@CrossOrigin
@RestController
@RequestMapping("api/productInventory")
public class ProductInventoryController extends ApiController {

    @Resource
    private ProductInventoryService productInventoryService;


    @RespMsg
    @PostMapping(value = "search")
    public Object search(Page<ProductInventory> page, ProductInventory productInventory) {
        return this.productInventoryService.page(page, new QueryWrapper<>(productInventory));
    }


    @RespMsg
    @GetMapping(value = "getProductInventory/{id}")
    public Object getProductInventory(@PathVariable("id") String id) {
        return this.productInventoryService.getById(id);
    }


    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody ProductInventory productInventory) {
        return this.productInventoryService.save(productInventory);
    }

    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody ProductInventory productInventory) {
        return this.productInventoryService.updateById(productInventory);
    }

    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productInventoryService.removeByIds(ids);
    }
}