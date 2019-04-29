package cn.ppl.entity;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *     产品信息实体
 * </p>
 *
 * @author lzt
 * @version $Id: <ProductEntity>, v <1.0.0> 10:14 2019/4/28 lzt Exp $
 */
@Data
@ToString
public class ProductEntity implements Serializable {
    private static final long serialVersionUID = -5963000150414296465L;

    private Long id;
    private String productDesc;
    private String productName;
}
