package com.orderingfood.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.orderingfood.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    List<OrderDetail> selectAllByOrderId(@Param("orderId")String orderId);


}