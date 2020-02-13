package com.orderingfood.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.orderingfood.pojo.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);

    List<ProductCategory> findAllByCategoryType(@Param("list")List<Integer> list);


}