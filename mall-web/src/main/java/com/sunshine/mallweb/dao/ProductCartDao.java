package com.sunshine.mallweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.dto.CartDTO;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.ProductCart;
import org.apache.ibatis.annotations.Param;

/**
 * (ProductCar)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-14 22:42:11
 */
public interface ProductCartDao extends BaseMapper<ProductCart> {

    IPage<ProductCart> getProductCartListByConditionPage(Page<ProductCart> page, @Param("cart") CartDTO cart);

    ProductCart  getProductCartById(@Param("id") String id);

}