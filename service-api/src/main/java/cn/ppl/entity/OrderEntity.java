package cn.ppl.entity;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *     订单实体
 * </p>
 *
 * @author lzt
 * @version $Id: <OrderEntity>, v <1.0.0> 11:22 2019/4/28 lzt Exp $
 */
@Data
@ToString
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = -1398425846520203964L;
    private Long id;
    private String orderCode;
    private ProductEntity productEntity;
    private BigDecimal totalFee;
}
