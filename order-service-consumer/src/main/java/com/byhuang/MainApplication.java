package com.byhuang;

import com.byhuang.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 20:40
 * @description TODO
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = ioc.getBean(OrderService.class);
        orderService.initOrder("001");
        System.in.read();
    }
}
