package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.OrderDetailDao;
import com.sunshine.mallweb.dto.OrderDetailDTO;
import com.sunshine.mallweb.entity.OrderDetail;
import com.sunshine.mallweb.service.OrderDetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单详情表(OrderDetail)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:47
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailDao, OrderDetail> implements OrderDetailService {

    @Resource
    OrderDetailDao orderDetailDao;

    @Override
    public List<OrderDetail> getOrderDetailListByOrderId(String id) {
        return this.orderDetailDao.getOrderDetailListByOrderId(id);
    }

    @Override
    public IPage<OrderDetail> getOrderDetailsByConditionPage(Page<OrderDetail> page, OrderDetailDTO orderDetail) {
        return this.orderDetailDao.getOrderDetailsByConditionPage(page,orderDetail);
    }

    @Override
    public OrderDetail getOrderDetailsById(String id) {
        return this.orderDetailDao.getOrderDetailsById(id);
    }
}