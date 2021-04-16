package com.sunshine.mallweb.dto;

/**
 * @author hongtao
 * @version 1.0.0
 * @ClassName ProductDTO.java
 * @Description TODO
 * @createTime 2021年04月14日 20:02:00
 */
public class ProductInfoDTO extends BaseDTO{

    private Integer orderByType;

    private String productName;

    private String productNo;

    private Integer productStatus;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(Integer orderByType) {
        this.orderByType = orderByType;
    }
}
