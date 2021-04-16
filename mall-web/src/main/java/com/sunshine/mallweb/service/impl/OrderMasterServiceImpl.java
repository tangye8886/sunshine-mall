package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.OrderMasterDao;
import com.sunshine.mallweb.dto.OrderMasterDTO;
import com.sunshine.mallweb.entity.OrderMaster;
import com.sunshine.mallweb.service.OrderMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 订单表(OrderMaster)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:37
 */
@Service("orderMasterService")
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterDao, OrderMaster> implements OrderMasterService {

    @Resource
    OrderMasterDao orderMasterDao;

    @Override
    public OrderMaster getOrderMasterById(String id) {
        return this.orderMasterDao.getOrderMasterById(id);
    }

    @Override
    public IPage<OrderMaster> getOrderMasterListByConditionPage(Page<OrderMaster> page, OrderMasterDTO orderMaster) {
        return this.orderMasterDao.getOrderMasterListByConditionPage(page,orderMaster);
    }
}