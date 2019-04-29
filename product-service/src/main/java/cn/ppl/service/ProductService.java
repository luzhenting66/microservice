package cn.ppl.service;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;

import java.util.List;

/**
 * <p>
 * 产品服务
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductService>, v <1.0.0> 10:20 2019/4/28 lzt Exp $
 */
public interface ProductService {

    boolean create(ProductEntity product);

    ProductEntity findById(Long id);

    List<ProductEntity> findAll();
}
