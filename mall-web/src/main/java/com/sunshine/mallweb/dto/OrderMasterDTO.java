package com.sunshine.mallweb.dto;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName OrderMasterDTO.java
 * @Description TODO
 * @createTime 2021年04月14日 20:48:00
 */
public class OrderMasterDTO extends BaseDTO {


    private String accountId;

    private String buyerName;

    private Integer orderStatus;


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}
