package com.byhuang.service;

import com.byhuang.bean.UserAddress;

import java.util.List;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 12:22
 * @description TODO
 */
public interface UserService {

    public List<UserAddress> getAddress(String uid);
}
