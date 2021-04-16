package com.sunshine.mallweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (ProductCar)表实体类
 *
 * @author tanghongtao
 * @since 2021-04-14 22:42:11
 */
@SuppressWarnings("serial")
public class ProductCart extends Model<ProductCart> {

    //购物车标识
    @TableId(value = "cart_id", type = IdType.UUID)
    private String cartId;
    //用户标识
    private String accountId;
    //产品标识
    private String productId;
    //数量
    private Integer productAmount;

    private Integer enabled;

    @TableField(exist = false)
    private ProductInfo productInfo;


    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.cartId;
    }
}