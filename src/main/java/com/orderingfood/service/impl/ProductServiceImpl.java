package com.orderingfood.service.impl;

import com.orderingfood.dto.CartDTO;
import com.orderingfood.enums.ResultEnum;
import com.orderingfood.exception.SellException;
import com.orderingfood.mapper.ProductInfoMapper;
import com.orderingfood.pojo.ProductInfo;
import com.orderingfood.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.NumberUtils;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getUpAll() {
        return productInfoMapper.findAllByProductStatus(0);
    }

    @Override
    public void reduceStock(List<CartDTO> cartDTOs) {
        for (CartDTO cartDTO : cartDTOs) {
            ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(cartDTO.getProductId());
            if(productInfo == null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if(result < 0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);
            productInfoMapper.updateByPrimaryKeySelective(productInfo);
        }
    }

    @Override
    public void addStock(List<CartDTO> cartDTOs) {
        for (CartDTO cartDTO : cartDTOs) {
            ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(cartDTO.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();

            productInfo.setProductStock(result);
            productInfoMapper.updateByPrimaryKeySelective(productInfo);
        }
    }
}
