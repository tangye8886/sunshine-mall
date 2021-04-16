package com.sunshine.mallweb.dao;

import java.util.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.dto.OrderDetailDTO;
import com.sunshine.mallweb.dto.ProductInfoDTO;
import com.sunshine.mallweb.entity.OrderDetail;
import com.sunshine.mallweb.entity.ProductInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 订单详情表(OrderDetail)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:47
 */
public interface OrderDetailDao extends BaseMapper<OrderDetail> {

    List<OrderDetail> getOrderDetailListByOrderId(@Param("id") String id);

    IPage<OrderDetail> getOrderDetailsByConditionPage(Page<OrderDetail> page, @Param("orderDetail") OrderDetailDTO orderDetail);

    OrderDetail getOrderDetailsById(@Param("id") String id);

}