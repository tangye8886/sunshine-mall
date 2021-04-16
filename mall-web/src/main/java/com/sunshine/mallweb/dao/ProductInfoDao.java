package com.sunshine.mallweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;

/**
 * (ProductInfo)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:14
 */
public interface ProductInfoDao extends BaseMapper<ProductInfo> {

    IPage<ProductInfo> getProductInfoListByConditionPage(Page<ProductInfo> page, @Param("product") ProductInfoDTO product);

    ProductInfo getProductInfoById(@Param("id")String id);

}