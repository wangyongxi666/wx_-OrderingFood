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
public class ProductInfo {

//    @Id
//    @GeneratedValue
    private String productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 单价
    */
    private BigDecimal productPrice;

    /**
    * 库存
    */
    private Integer productStock;

    /**
    * 描述
    */
    private String productDescription;

    /**
    * 小图
    */
    private String productIcon;

    /**
    * 商品状态,0正常1下架
    */
    private Byte productStatus;

    /**
    * 类目编号
    */
    private Integer categoryType;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}