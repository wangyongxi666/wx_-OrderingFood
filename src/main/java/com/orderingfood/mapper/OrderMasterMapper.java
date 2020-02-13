package com.orderingfood.mapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.orderingfood.pojo.OrderMaster;

public interface OrderMasterMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);

    Page<OrderMaster> selectByBuyerOpenid(@Param("buyerOpenid")String buyerOpenid);

}