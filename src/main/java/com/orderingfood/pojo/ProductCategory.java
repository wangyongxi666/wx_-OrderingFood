package com.orderingfood.pojo;

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
public class ProductCategory {

//    @Id
//    @GeneratedValue
    private Integer categoryId;

    /**
    * 类目名字
    */
    private String categoryName;

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