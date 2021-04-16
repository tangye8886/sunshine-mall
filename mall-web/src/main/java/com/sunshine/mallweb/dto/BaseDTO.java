package com.sunshine.mallweb.dto;

import java.io.Serializable;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName BaseDTO.java
 * @Description TODO
 * @createTime 2021年03月22日 20:43:00
 */
public class BaseDTO implements Serializable {

    private Integer current;
    private Integer size;
    private Integer total;
    private Integer enabled;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getEnabled() {
        return enabled;
    }
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
