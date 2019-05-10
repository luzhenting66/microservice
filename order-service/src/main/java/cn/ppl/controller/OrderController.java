package cn.ppl.controller;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.OrderEntity;
import cn.ppl.entity.ProductEntity;
import cn.ppl.service.IProductClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 订单controller
 * </p>
 *
 * @author lzt
 * @version $Id: <OrderController>, v <1.0.1> 12:01 2019/4/28 lzt Exp $
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IProductClientService productFeignService;

    @HystrixCommand
    @RequestMapping("/get/{id}")
    public OrderEntity get(@PathVariable("id") long id) {

        OrderEntity orderEntity = new OrderEntity() {
            {
                setId(id);
                setOrderCode("1000" + id);
                setTotalFee(new BigDecimal("100" + getId()));
                setProductEntity(productFeignService.get(id));
            }
        };
        return orderEntity;
    }

    @RequestMapping("/list")
    public OrderEntity list(){
        List<ProductEntity> list = productFeignService.list();

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setProductEntity(list.get(0));
        orderEntity.setTotalFee(new BigDecimal(1111));
        orderEntity.setOrderCode("11111");
        orderEntity.setId(11111L);
        return orderEntity;
    }
}
