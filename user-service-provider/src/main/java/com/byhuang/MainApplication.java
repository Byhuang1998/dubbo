package com.byhuang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 14:29
 * @description TODO
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
//        ioc.getBean()
        System.in.read();
    }
}
