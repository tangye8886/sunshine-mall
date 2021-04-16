package com.sunshine.mallweb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunshine.mallweb.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 类目表(ProcuctCategory)表数据库访问层
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:39
 */
public interface ProductCategoryDao extends BaseMapper<ProductCategory> {

    @Select("select * from product_category where category_id = #{id}")
    ProductCategory getProductCategoryById(@Param("id") String id);
}