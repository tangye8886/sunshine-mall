package com.sunshine.mallweb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.mallweb.dao.ProductLoveDao;
import com.sunshine.mallweb.entity.ProductLove;
import com.sunshine.mallweb.service.ProductLoveService;
import org.springframework.stereotype.Service;

/**
 * 收藏详情表(ProductLove)表服务实现类
 *
 * @author tanghongtao
 * @since 2021-04-15 19:36:39
 */
@Service("productLoveService")
public class ProductLoveServiceImpl extends ServiceImpl<ProductLoveDao, ProductLove> implements ProductLoveService {

}