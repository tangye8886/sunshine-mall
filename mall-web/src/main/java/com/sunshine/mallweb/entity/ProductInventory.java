package com.sunshine.mallweb.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 库存表(ProductInventory)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:28
 */
@SuppressWarnings("serial")
public class ProductInventory extends BaseAbstractEntity<ProductInventory> {

    @TableId(value = "inventory_id", type = IdType.UUID)
    private String inventoryId;
    //产品标识
    private String productId;
    //产品型号
    private String productType;
    //数量
    private String amount;


    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.inventoryId;
    }
    }