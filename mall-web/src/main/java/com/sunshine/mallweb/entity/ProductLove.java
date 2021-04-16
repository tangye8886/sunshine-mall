package com.sunshine.mallweb.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 收藏详情表(ProductLove)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-15 19:36:39
 */
@SuppressWarnings("serial")
public class ProductLove extends BaseAbstractEntity<ProductLove> {
    //标识
    @TableId(value = "love_id", type = IdType.UUID)
    private String loveId;
    //用户标识
    private String accountId;
    //产品ID
    private String productId;

    @TableField(exist = false)
    private ProductInfo productInfo;

    public String getLoveId() {
        return loveId;
    }

    public void setLoveId(String loveId) {
        this.loveId = loveId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
        return this.loveId;
    }
}