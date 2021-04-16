package com.sunshine.mallweb.entity;

import java.util.*;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (ProductInfo)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:14
 */
@SuppressWarnings("serial")
public class ProductInfo extends BaseAbstractEntity<ProductInfo> {
    //标识
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    //商品编号
    private String productNo;
    //商品名称
    private String productName;
    //单价
    private Double productPrice;
    //描述
    private String productDescription;
    //图片
    private String productImg;
    //类目编号
    private String categoryType;

    //库存
    private Integer productInventory;

    //状态
    private Integer productStatus;

    //促销信息
    private String productActivity;

    @TableField(exist = false)
    private ProductCategory productCategory;

    //    @TableField(exist = false)
//    private List<ProductInventory> productInventoryList;// 库存


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }


    public Integer getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(Integer productInventory) {
        this.productInventory = productInventory;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductActivity() {
        return productActivity;
    }

    public void setProductActivity(String productActivity) {
        this.productActivity = productActivity;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }