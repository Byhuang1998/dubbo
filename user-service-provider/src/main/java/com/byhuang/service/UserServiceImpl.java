package com.byhuang.service;


import com.byhuang.bean.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 12:24
 * @description TODO
 * 1、将服务提供者注册到注册中心（暴露服务）
 *    1) 导入dubbo依赖，及操作zookeeper的客户端curator
 *    2) 配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
public class UserServiceImpl implements UserService {

    public List<UserAddress> getAddress(String uid) {
        UserAddress ua1 = new UserAddress("001", "北京东城");
        UserAddress ua2 = new UserAddress("001", "上海浦东");
        return Arrays.asList(ua1, ua2);
    }
}
