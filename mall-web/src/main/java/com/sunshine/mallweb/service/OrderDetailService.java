package com.sunshine.mallweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.mallweb.dto.OrderDetailDTO;
import com.sunshine.mallweb.entity.OrderDetail;

import java.util.List;

/**
 * 订单详情表(OrderDetail)表服务接口
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:47
 */
public interface OrderDetailService extends IService<OrderDetail> {

    List<OrderDetail> getOrderDetailListByOrderId(String id);

    IPage<OrderDetail> getOrderDetailsByConditionPage(Page<OrderDetail> page, OrderDetailDTO orderDetail);

    OrderDetail getOrderDetailsById(String id);


}