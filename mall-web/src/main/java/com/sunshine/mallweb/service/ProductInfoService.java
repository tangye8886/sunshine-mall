package com.sunshine.mallweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;

/**
 * (ProductInfo)表服务接口
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:14
 */
public interface ProductInfoService extends IService<ProductInfo> {

    IPage<ProductInfo> getProductInfoListByConditionPage(Page<ProductInfo> page, ProductInfoDTO product);

    ProductInfo getProductInfoById(String id);
}