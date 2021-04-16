package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductInventoryDao;
import com.sunshine.mallweb.entity.ProductInventory;
import com.sunshine.mallweb.service.ProductInventoryService;
import org.springframework.stereotype.Service;

/**
 * 库存表(ProductInventory)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-13 23:12:28
 */
@Service("productInventoryService")
public class ProductInventoryServiceImpl extends ServiceImpl<ProductInventoryDao, ProductInventory> implements ProductInventoryService {

}