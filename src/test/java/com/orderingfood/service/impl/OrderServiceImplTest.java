package com.orderingfood.service.impl;

import com.orderingfood.dto.OrderDTO;
import com.orderingfood.pojo.OrderDetail;
import com.orderingfood.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    void create() {

        OrderDTO orderDTO = new OrderDTO();

        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("1");
        orderDetail1.setProductQuantity(10);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("2");
        orderDetail2.setProductQuantity(10);

        List list = new ArrayList<>();
        list.add(orderDetail1);
        list.add(orderDetail2);

        orderDTO.setBuyerName("老王");
        orderDTO.setBuyerPhone("18802653134");
        orderDTO.setBuyerAddress("在这里");
        orderDTO.setBuyerOpenid("123456");
        orderDTO.setOrderDetailList(list);

        orderService.create(orderDTO);
    }

    @Test
    void findOne() {
    }

    @Test
    void findList() {
    }

    @Test
    void cancel() {

        OrderDTO one = orderService.findOne("1581571585595780870");

        orderService.cancel(one);
    }

    @Test
    void finish(){
        OrderDTO one = orderService.findOne("1581593117968617842");

        orderService.finish(one);
    }


}