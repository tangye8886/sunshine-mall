package com.sunshine.mallweb.dto;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName OrderDetailDTO.java
 * @Description TODO
 * @createTime 2021年04月14日 20:47:00
 */
public class OrderDetailDTO extends BaseDTO{

    private String orderId;

    private String productId;

    private String productName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
