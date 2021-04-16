package com.sunshine.mallweb.entity;

import java.util.*;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 订单详情表(OrderDetail)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:13:47
 */
@SuppressWarnings("serial")
public class OrderDetail extends BaseAbstractEntity<OrderDetail> {

    @TableId(value = "detail_id", type = IdType.UUID)
    private String detailId;
    
    private String orderId;
    
    private String productId;
    //商品名称
    private String productName;
    //商品价格
    private Double productPrice;
    //商品数量
    private Integer productQuantity;

    //商品具体详情
    @TableField(exist = false)
    private ProductInfo productInfo;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.detailId;
    }
    }