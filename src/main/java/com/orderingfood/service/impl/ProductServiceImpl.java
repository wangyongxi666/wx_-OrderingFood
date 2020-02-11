package com.orderingfood.service.impl;

import com.orderingfood.mapper.ProductInfoMapper;
import com.orderingfood.pojo.ProductInfo;
import com.orderingfood.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getUpAll() {
        return productInfoMapper.findAllByProductStatus(0);
    }
}
