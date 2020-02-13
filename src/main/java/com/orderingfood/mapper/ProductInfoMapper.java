package com.orderingfood.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.orderingfood.pojo.ProductInfo;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);

    List<ProductInfo> findAllByProductStatus(@Param("productStatus")Integer productStatus);


}