package cn.ppl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductApplication>, v <1.0.0> 10:38 2019/4/28 lzt Exp $
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "cn.ppl.mapper")
@EnableHystrix
@EnableCircuitBreaker
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
