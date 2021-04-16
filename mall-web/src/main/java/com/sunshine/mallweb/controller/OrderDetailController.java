package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.dto.OrderDetailDTO;
import com.sunshine.mallweb.entity.OrderDetail;
import com.sunshine.mallweb.entity.OrderMaster;
import com.sunshine.mallweb.service.OrderDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 订单详情表(OrderDetail)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:47
 */
@CrossOrigin
@RestController
@RequestMapping("api/orderDetail")
public class OrderDetailController extends ApiController {

    @Resource
    private OrderDetailService orderDetailService;

    @RespMsg
    @PostMapping(value = "search")
    public Object search(@RequestBody OrderDetailDTO orderDetail) {
        Page<OrderDetail> page =new Page<>();
        page.setSize(orderDetail.getSize());
        page.setCurrent(orderDetail.getCurrent());
        return this.orderDetailService.getOrderDetailsByConditionPage(page,orderDetail);
    }

    @RespMsg
    @GetMapping("getOrderDetailsById/{id}")
    public Object getOrderDetailsById(@PathVariable("id") String id) {
        return this.orderDetailService.getOrderDetailsById(id);
    }


    @RespMsg
    @PostMapping(value = "insert")
    public Object insert(@RequestBody OrderDetail orderDetail) {
        return this.orderDetailService.save(orderDetail);
    }

    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody OrderDetail orderDetail) {
        return this.orderDetailService.updateById(orderDetail);
    }

    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.orderDetailService.removeByIds(ids);
    }
}