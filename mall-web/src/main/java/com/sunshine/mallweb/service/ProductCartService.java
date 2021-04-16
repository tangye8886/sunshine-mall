package com.sunshine.mallweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.mallweb.dto.CartDTO;
import com.sunshine.mallweb.entity.ProductCart;
import org.apache.ibatis.annotations.Param;

/**
 * (ProductCar)表服务接口
 *
 * @author tanghongtao
 * @since 2021-04-14 22:42:11
 */
public interface ProductCartService extends IService<ProductCart> {

    IPage<ProductCart> getProductCartListByConditionPage(Page<ProductCart> page,CartDTO cart);

    ProductCart  getProductCartById(String id);

}