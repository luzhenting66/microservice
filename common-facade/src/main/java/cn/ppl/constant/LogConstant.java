package cn.ppl.constant;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 13:42 2019/5/10 lzt Exp $
 */
public class LogConstant {
    private LogConstant(){}

    public static final String GATEWAY_REQUEST_START = "【RequestStart】|reqId={}|~|ip={}|~|url={}|~|token={}|~|sign={}|~|reqTime={}|~|reqData={}";
    public static final String GATEWAY_REQUEST_END = "【RequesteEnd】|reqId={}|~|costTime={}|~|resultCode={}|~|resultMsg={}|~|repData={}";
}
