package com.yx.xx.transaction.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单详情实体类
 */
@TableName("order_detail")
@Data
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单详情ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 卖家ID
     */
    private Long sellerId;

    /**
     * 快递ID
     */
    private Long expressId;

    /**
     * 快递名称
     */
    private String expressName;

    /**
     * 快递价格
     */
    private Double expressPrice;

    /**
     * 商品图片
     */
    private String goodsImg;

    /**
     * 商品数量
     */
    private Integer buyCount;

    /**
     * 商品价格
     */
    private Double goodsPrice;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 订单状态：
     * 1 - 未发货
     * 2 - 已发货
     * 3 - 待退款
     * 4 - 已收货
     */
    private Integer orderStatus;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", sellerId=" + sellerId +
                ", expressId=" + expressId +
                ", expressName='" + expressName + '\'' +
                ", expressPrice=" + expressPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", buyCount=" + buyCount +
                ", goodsPrice=" + goodsPrice +
                ", goodsName='" + goodsName + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
