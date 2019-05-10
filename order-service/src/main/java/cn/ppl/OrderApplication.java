package cn.ppl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <OrderApplication>, v <versionName> 12:06 2019/5/7 lzt Exp $
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
