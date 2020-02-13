package com.orderingfood.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.orderingfood.enums.OrderStatusEnum;
import com.orderingfood.enums.PayStatusEnum;
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
public class OrderMaster {

//    @Id
//    @GeneratedValue
    private String orderId;

    /**
    * 买家名字
    */
    private String buyerName;

    /**
    * 买家电话
    */
    private String buyerPhone;

    /**
    * 买家地址
    */
    private String buyerAddress;

    /**
    * 买家微信openid
    */
    private String buyerOpenid;

    /**
    * 订单总金额
    */
    private BigDecimal orderAmount;

    /**
    * 订单状态, 默认为新下单
    */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**
    * 支付状态, 默认未支付
    */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}