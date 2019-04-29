package cn.ppl.service;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;
import cn.ppl.hystrix.HystirxProductClientServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 14:37 2019/4/29 lzt Exp $
 */
@FeignClient(name = "PRODUCT-SERVICE",fallback = HystirxProductClientServiceImpl.class)
public interface IProductClientService {
    @HystrixCommand
    @RequestMapping(value = "/product/get/{id}")
    ProductEntity get(@PathVariable("id") long id);

    @RequestMapping(value = "/product/list")
    List<ProductEntity> list();
}
