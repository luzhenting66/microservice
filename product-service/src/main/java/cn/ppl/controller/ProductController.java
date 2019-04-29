package cn.ppl.controller;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;
import cn.ppl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 产品controller
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductController>, v <1.0.0> 10:34 2019/4/28 lzt Exp $
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/get/{id}")
    public ProductEntity get(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @RequestMapping(value = "/add")
    public boolean add(@RequestBody ProductEntity product) {
        return productService.create(product);
    }

    @RequestMapping(value = "/list")
    public List<ProductEntity> list() {
        return productService.findAll();
    }

}
