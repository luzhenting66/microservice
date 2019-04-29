package cn.ppl.hystrix;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import cn.ppl.entity.ProductEntity;
import cn.ppl.service.IProductClientService;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *     商品服务降级
 * </p>
 *
 * @author lzt
 * @version $Id: <HystirxProductClientServiceImpl>, v <versionName> 14:39 2019/4/29 lzt Exp $
 */
@Service
public class HystirxProductClientServiceImpl implements IProductClientService {
    @Override
    public ProductEntity get(long id) {
        System.err.println("------------出错了---------------");
        return new ProductEntity() {
            {
                setId(9999L);
                setProductDesc("出错了。。。");
                setProductName("出错了。。。");
            }
        };
    }

    @Override
    public List<ProductEntity> list() {

        return Lists.newArrayList(new ProductEntity(){{
            setId(9999L);
            setProductName("出错了");
            setProductDesc("出错了");
        }});
    }
}
