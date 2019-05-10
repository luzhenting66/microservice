package cn.ppl.config;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 10:31 2019/5/10 lzt Exp $
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

    //解决跨域问题
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
