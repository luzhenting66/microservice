package config;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 *     路由策略
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 10:55 2019/4/29 lzt Exp $
 */

public class ProductRoutConfig {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
