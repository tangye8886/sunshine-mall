package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductDetailsDao;
import com.sunshine.mallweb.entity.ProductDetails;
import com.sunshine.mallweb.service.ProductDetailsService;
import org.springframework.stereotype.Service;

/**
 * 商品详情表(ProductDetails)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-15 22:43:11
 */
@Service("productDetailsService")
public class ProductDetailsServiceImpl extends ServiceImpl<ProductDetailsDao, ProductDetails> implements ProductDetailsService {

}