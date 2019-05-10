package cn.ppl.request;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <Request>, v <1.0.0> 11:15 2019/5/10 lzt Exp $
 */
@Data
@NoArgsConstructor
@ToString
public class Request<T> implements Serializable{
    private static final long serialVersionUID = -6349750024168785868L;
    private String reqId;
    private String traceId;//调用链使用
    private String token;
    private String sign;
    private String reqTime;
    private T data;
}
