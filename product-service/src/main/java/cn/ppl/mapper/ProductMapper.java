package cn.ppl.mapper;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;

import java.util.List;

/**
 * <p>
 * 产品mapper
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductMapper>, v <1.0.0> 10:21 2019/4/28 lzt Exp $
 */
public interface ProductMapper {

    boolean create(ProductEntity product);

    ProductEntity findById(Long id);

    List<ProductEntity> findAll();
}
