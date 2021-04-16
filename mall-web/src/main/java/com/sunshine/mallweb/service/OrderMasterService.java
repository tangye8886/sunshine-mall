package com.sunshine.mallweb.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sunshine.mallweb.dto.OrderMasterDTO;
import com.sunshine.mallweb.entity.OrderMaster;
import org.apache.ibatis.annotations.Param;

/**
 * 订单表(OrderMaster)表服务接口
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:37
 */
public interface OrderMasterService extends IService<OrderMaster> {

    OrderMaster getOrderMasterById(String id);

    IPage<OrderMaster> getOrderMasterListByConditionPage(Page<OrderMaster> page, OrderMasterDTO orderMaster);

}