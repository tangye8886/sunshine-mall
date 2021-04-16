package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductKeyDao;
import com.sunshine.mallweb.entity.ProductKey;
import com.sunshine.mallweb.service.ProductKeyService;
import org.springframework.stereotype.Service;

/**
 * 产品关键字(ProductKey)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-15 20:39:11
 */
@Service("productKeyService")
public class ProductKeyServiceImpl extends ServiceImpl<ProductKeyDao, ProductKey> implements ProductKeyService {

}