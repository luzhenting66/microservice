package cn.ppl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 14:19 2019/4/28 lzt Exp $
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka3Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka3Application.class,args);
    }
}
