package com.sunshine.mallweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * 类目表(ProcuctCategory)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:39
 */
@SuppressWarnings("serial")
public class ProductCategory extends BaseAbstractEntity<ProductCategory> {

    @TableId(value = "category_id", type = IdType.UUID)
    private String categoryId;
    //类目名字
    private String categoryName;
    //类目编号
    private Integer categoryType;


    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.categoryId;
    }
    }