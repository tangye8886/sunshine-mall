package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductInfoDao;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.service.ProductInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (ProductInfo)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:14
 */
@Service("productInfoService")
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoDao, ProductInfo> implements ProductInfoService {

    @Resource
    ProductInfoDao productInfoDao;


    @Override
    public IPage<ProductInfo> getProductInfoListByConditionPage(Page<ProductInfo> page, ProductInfoDTO product) {
        return this.productInfoDao.getProductInfoListByConditionPage(page,product);
    }

    @Override
    public ProductInfo getProductInfoById(String id) {
        return this.productInfoDao.getProductInfoById(id);
    }
}