package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.dto.CartDTO;
import com.sunshine.mallweb.entity.ProductCart;
import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.service.ProductCartService;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ProductCar)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-14 22:42:11
 */
@CrossOrigin
@RestController
@RequestMapping("api/cart")
public class ProductCartController extends ApiController {

    @Resource
    private ProductCartService productCarService;


    @RespMsg
    @PostMapping(value = "search")
    public Object search(@RequestBody CartDTO productCar) {
        Page<ProductCart> page =new Page<>();
        page.setSize(productCar.getSize());
        page.setCurrent(productCar.getCurrent());
        productCar.setAccountId("admin");
        return this.productCarService.getProductCartListByConditionPage(page,productCar);
    }

    @RespMsg
    @GetMapping("getCartById/{id}")
    public Object getCartById(@PathVariable("id") String id) {
        return this.productCarService.getById(id);
    }

    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody ProductCart productCar) {
        //获取用户名（唯一标识）
        //SecurityContextHolder.getContext().getAuthentication().getPrincipal()
        productCar.setAccountId("admin");
        if(productCar!=null)
        {
            QueryWrapper<ProductCart> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("product_id",productCar.getProductId());
            queryWrapper.eq("account_id",productCar.getAccountId());
            List<ProductCart> productCarts = this.productCarService.getBaseMapper().selectList(queryWrapper);
            if(CollectionUtils.isEmpty(productCarts)){ // TODO 空 直接放入
                this.productCarService.save(productCar);
            }else{ // TODO 不为空 只更新数目
                ProductCart cart = productCarts.get(0);
                Integer total = cart.getProductAmount()+productCar.getProductAmount();
                cart.setProductAmount(total);
                this.productCarService.updateById(cart);
            }
        }
        return true;
    }

    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody ProductCart productCar) {
        return this.productCarService.updateById(productCar);
    }

    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.productCarService.removeByIds(ids);
    }
}