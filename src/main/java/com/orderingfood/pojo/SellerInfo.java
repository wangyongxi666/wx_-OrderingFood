package com.orderingfood.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@Entity
//@DynamicUpdate
public class SellerInfo {
//    @Id
//    @GeneratedValue
    private String id;

    private String username;

    private String password;

    /**
    * 微信openid
    */
    private String openid;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}