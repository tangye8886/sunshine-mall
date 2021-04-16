package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductCartDao;
import com.sunshine.mallweb.dto.CartDTO;
import com.sunshine.mallweb.entity.ProductCart;
import com.sunshine.mallweb.service.ProductCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (ProductCar)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-14 22:42:11
 */
@Service("productCarService")
public class ProductCartServiceImpl extends ServiceImpl<ProductCartDao, ProductCart> implements ProductCartService {

    @Resource
    ProductCartDao productCartDao;

    @Override
    public IPage<ProductCart> getProductCartListByConditionPage(Page<ProductCart> page, CartDTO cart) {
        return productCartDao.getProductCartListByConditionPage(page,cart);
    }

    @Override
    public ProductCart getProductCartById(String id) {
        return productCartDao.getProductCartById(id);
    }
}