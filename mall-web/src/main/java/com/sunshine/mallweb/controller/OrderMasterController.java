package com.sunshine.mallweb.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunshine.mallweb.common.OrderUtils;
import com.sunshine.mallweb.common.RespMsg;
import com.sunshine.mallweb.dto.OrderMasterDTO;
import com.sunshine.mallweb.entity.OrderMaster;
import com.sunshine.mallweb.entity.ProductInfo;
import com.sunshine.mallweb.service.OrderMasterService;
import com.sunshine.mallweb.service.ProductInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 订单表(OrderMaster)表控制层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:37
 */
@CrossOrigin
@RestController
@RequestMapping("api/orderMaster")
public class OrderMasterController extends ApiController {

    @Resource
    private OrderMasterService orderMasterService;

    @Resource
    private ProductInfoService productInfoService;


    @RespMsg
    @PostMapping(value = "search")
    public Object search(@RequestBody OrderMasterDTO orderMaster) {
        Page<OrderMaster> page =new Page<>();
        page.setSize(orderMaster.getSize());
        page.setCurrent(orderMaster.getCurrent());
        return this.orderMasterService.getOrderMasterListByConditionPage(page,orderMaster);
    }


    @RespMsg
    @GetMapping(value = "getOrderMasterById/{id}")
    public Object getOrderMasterById(@PathVariable("id") String id) {
        return this.orderMasterService.getOrderMasterById(id);
    }

    // TODO 提交生成订单
    @RespMsg
    @GetMapping(value = "makeOrder")
    public Object makeOrder(@RequestBody OrderMaster orderMaster,@Param("productIds") List<String> productIds) {

        //TODO 生成订单编号
        String orderNo = OrderUtils.makeOrderNo();
        orderMaster.setOrderId(orderNo);
        orderMaster.setPayStatus(0); // 待付款
        orderMaster.setOrderStatus(1); //订单状态 已生成

        Double amount = 0d;
        // 核对金额
        for(String id:productIds)
        {
            ProductInfo productInfo = productInfoService.getById(id);
            amount +=productInfo.getProductPrice();
        }

        boolean save = this.orderMasterService.save(orderMaster);
        return save;
    }



//    @RespMsg
//    @PostMapping(value = "insert")
//    public Object insert(@RequestBody OrderMaster orderMaster) {
//        return this.orderMasterService.save(orderMaster);
//    }


    @RespMsg
    @PutMapping(value = "update")
    public Object update(@RequestBody OrderMaster orderMaster) {
        return this.orderMasterService.updateById(orderMaster);
    }


    @RespMsg
    @DeleteMapping(value = "delete")
    public Object delete(@RequestParam("ids") List<String> ids) {
        return this.orderMasterService.removeByIds(ids);
    }
}