package com.sunshine.mallweb.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName BaseAbstract.java
 * @Description TODO 父类基础类
 * @createTime 2021年03月17日 23:20:00
 */
public class BaseAbstractEntity<T> extends Model implements Serializable {

    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //是否可用
    private Integer enabled;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
