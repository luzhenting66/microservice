package cn.ppl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 12:19 2019/5/7 lzt Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class,args);
    }
}
