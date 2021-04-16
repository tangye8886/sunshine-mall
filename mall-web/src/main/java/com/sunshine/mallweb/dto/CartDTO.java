package com.sunshine.mallweb.dto;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName OrderDetailDTO.java
 * @Description TODO
 * @createTime 2021年04月14日 20:47:00
 */
public class CartDTO extends BaseDTO{

    private Integer enabled;

    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    @Override
    public Integer getEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
