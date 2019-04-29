package cn.ppl.base;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <BaseEntity>, v <1.0.0> 11:25 2019/4/28 lzt Exp $
 */
@Data
@ToString
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2736784649595986400L;

    private Long id;

}
