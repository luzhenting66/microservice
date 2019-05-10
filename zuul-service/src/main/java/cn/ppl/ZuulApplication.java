package cn.ppl;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 10:15 2019/5/10 lzt Exp $
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
