package cn.ppl.base;
/**
 * anji-allways.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 * </p>
 *
 * @author lzt
 * @version $Id: <${ClassName}>, v <versionName> 11:26 2019/4/28 lzt Exp $
 */
@Data
@ToString
public abstract class BaseDataEntity extends BaseEntity {
    private String creator;
    private String modifier;
    private Date createTime;
    private Date modifyTime;
    private String delFlag;

    public static final String DEL_FLAG_NORMAL = "0";//正常
    public static final String DEL_FLAG_DELETED = "1";//删除


    public <T extends BaseDataEntity> void preInsert(T data,String userCode){
        data.setCreateTime(new Date());
        data.setModifyTime(data.getCreateTime());
        data.setCreator(userCode);
        data.setModifier(userCode);
        data.setDelFlag(DEL_FLAG_NORMAL);
    }

    public <T extends BaseDataEntity> void preUpdate(T data,String userCode){
        data.setModifier(userCode);
        data.setModifyTime(new Date());
    }
}
