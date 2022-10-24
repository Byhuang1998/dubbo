package com.byhuang.service;

import com.byhuang.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 12:36
 * @description TODO
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    UserService userService;

    public void initOrder(String uid) {
        List<UserAddress> address = userService.getAddress(uid);
        System.out.println(address);
    }
}
