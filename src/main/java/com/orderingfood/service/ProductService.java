package com.orderingfood.service;

import com.orderingfood.dto.CartDTO;
import com.orderingfood.pojo.ProductInfo;

import java.util.List;

public interface ProductService {

    public List<ProductInfo> getUpAll();

    //扣减库存
    public void reduceStock(List<CartDTO> cartDTOs);

    //增加库存
    public void addStock(List<CartDTO> cartDTOs);


}
