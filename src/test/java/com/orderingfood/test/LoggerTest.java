package com.orderingfood.test;

import com.orderingfood.mapper.SellerInfoMapper;
import com.orderingfood.pojo.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.yml")
public class LoggerTest {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;


    @Test
    public void test01() {

        System.out.println(123);
        System.out.println(sellerInfoMapper);
        System.out.println(sellerInfoMapper.selectByPrimaryKey("1"));

//        SellerInfo one = sellerInfoMapper.getOne("1");
//        System.out.println(one);
    }
}
