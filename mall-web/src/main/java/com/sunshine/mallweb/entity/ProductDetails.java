package com.sunshine.mallweb.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品详情表(ProductDetails)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-15 22:43:11
 */
@SuppressWarnings("serial")
public class ProductDetails extends Model<ProductDetails> {
    //标识
    @TableId(value = "detail_id", type = IdType.UUID)
    private String detailId;
    //产品ID
    private String productId;
    //属性名
    private String fieldName;
    //属性值
    private String fieldValue;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    
    private Integer enabled;


    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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