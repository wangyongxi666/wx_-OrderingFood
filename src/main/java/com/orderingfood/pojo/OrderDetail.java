package com.orderingfood.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@DynamicUpdate
public class OrderDetail {

//    @Id
//    @GeneratedValue
    private String detailId;

    private String orderId;

    private String productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 当前价格,单位分
    */
    private BigDecimal productPrice;

    /**
    * 数量
    */
    private Integer productQuantity;

    /**
    * 小图
    */
    private String productIcon;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}