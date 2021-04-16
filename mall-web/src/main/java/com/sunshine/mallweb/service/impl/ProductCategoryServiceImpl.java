package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductCategoryDao;
import com.sunshine.mallweb.entity.ProductCategory;
import com.sunshine.mallweb.service.ProductCategoryService;
import org.springframework.stereotype.Service;

/**
 * 类目表(ProcuctCategory)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:39
 */
@Service("procuctCategoryService")
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryDao, ProductCategory> implements ProductCategoryService {

}