package cn.ppl.filter;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.constant.LogConstant;
import cn.ppl.request.Request;
import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 10:24 2019/5/10 lzt Exp $
 */
public class AccessFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext requestContext = RequestContext.getCurrentContext();

        HttpServletRequest request = requestContext.getRequest();

        String requestData = getData(request);
        Request requestDTO = JSON.parseObject(requestData, Request.class);

        String ip = getIPAddr(request);

        String apiName = getApiName(request.getRequestURL().toString());

        if (Objects.nonNull(requestDTO)){
            logger.info(LogConstant.GATEWAY_REQUEST_START,requestDTO.getReqId(),ip,request.getRequestURL().toString(),
                    requestDTO.getToken(),requestDTO.getSign(),requestDTO.getReqTime(),
                    Objects.nonNull(requestDTO.getData())?requestDTO.getData().toString():"");
        }

        return null;
    }

    private String getApiName(String requestUrl) {
        logger.info("requestUrl={}",requestUrl);
        return requestUrl.substring(requestUrl.indexOf("/"),requestUrl.indexOf("://")+3);
    }

    private String getIPAddr(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("proxy-client-ip");
        }

        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("wl-proxy-client-ip");
        }

        if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }

        return ip;
    }

    private String getData(HttpServletRequest request) {
        String data = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream) request.getInputStream(), "utf-8"));
            StringBuffer stringBuffer = new StringBuffer("");
            String line ;
            while ((line = br.readLine())!=null){
                stringBuffer.append(line);
            }
            br.close();
            data = stringBuffer.toString();
        }catch (Exception e){
            logger.error("{}",e);
        }
        return data;
    }
}
