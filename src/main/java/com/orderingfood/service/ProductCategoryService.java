package com.orderingfood.service;

import com.orderingfood.pojo.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductCategoryService {

    public List<ProductCategory> getCategoryTypeIn(List<Integer> typeIds);

}
