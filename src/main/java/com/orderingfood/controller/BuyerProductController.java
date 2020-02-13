package com.orderingfood.controller;

import com.orderingfood.VO.ProductInfoVO;
import com.orderingfood.VO.ProductVO;
import com.orderingfood.VO.ResultVO;
import com.orderingfood.pojo.ProductCategory;
import com.orderingfood.pojo.ProductInfo;
import com.orderingfood.service.ProductCategoryService;
import com.orderingfood.service.ProductService;
import com.orderingfood.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO list(){

        //查询所有上架商品
        List<ProductInfo> all = productService.getUpAll();

        //一次性查询所有类目
        List<Integer> categoryTypeList =
                all
                        .stream()
                        .map(e -> e.getCategoryType())
                        .collect(Collectors.toList());
        List<ProductCategory> categoryTypeIn = productCategoryService.getCategoryTypeIn(categoryTypeList);

        //封装数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory category : categoryTypeIn) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(category.getCategoryType());
            productVO.setCategoryName(category.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : all) {
                if (productInfo.getCategoryType().equals(category.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    productInfoVO.setProductName(productInfo.getProductName());
                    productInfoVO.setProductPrice(productInfo.getProductPrice());
                    productInfoVO.setProductDescription(productInfo.getProductDescription());
                    productInfoVO.setProductIcon(productInfo.getProductIcon());
                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
