package cn.ppl.service.impl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;
import cn.ppl.mapper.ProductMapper;
import cn.ppl.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 产品服务实现
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductServiceImpl>, v <1.0.0> 10:21 2019/4/28 lzt Exp $
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Value("${server.port}")
    private int port;

    @Resource
    private ProductMapper productMapper;

    @Override
    public boolean create(ProductEntity product) {
        return productMapper.create(product);
    }

    @Override
    public ProductEntity findById(Long id) {
        ProductEntity productEntity = productMapper.findById(id);
        productEntity.setProductDesc(productEntity.getProductDesc()+"port:"+port);
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAll() {
        return productMapper.findAll();
    }
}
