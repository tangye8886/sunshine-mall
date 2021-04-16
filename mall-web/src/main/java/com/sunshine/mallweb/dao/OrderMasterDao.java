package com.sunshine.mallweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.dto.OrderMasterDTO;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.OrderMaster;
import com.sunshine.mallweb.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 订单表(OrderMaster)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:37
 */
public interface OrderMasterDao extends BaseMapper<OrderMaster> {

    IPage<OrderMaster>  getOrderMasterListByConditionPage(Page<OrderMaster> page, @Param("orderMaster") OrderMasterDTO orderMaster);

    OrderMaster getOrderMasterById(@Param("id")String id);

}