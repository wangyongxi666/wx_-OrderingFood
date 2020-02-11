package com.orderingfood.service.impl;

import com.orderingfood.mapper.ProductCategoryMapper;
import com.orderingfood.pojo.ProductCategory;
import com.orderingfood.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> getCategoryTypeIn(List<Integer> typeIds) {
        return productCategoryMapper.findAllByCategoryType(typeIds);
    }
}
