package com.orderingfood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.orderingfood.mapper")
@SpringBootApplication
public class OrderingfoodSellApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderingfoodSellApplication.class, args);
    }

}
