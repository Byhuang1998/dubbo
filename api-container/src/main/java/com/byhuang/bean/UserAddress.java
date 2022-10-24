package com.byhuang.bean;

import java.io.Serializable;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/10/24 12:22
 * @description TODO
 */
public class UserAddress implements Serializable{

    private String uid;

    private String location;

    public UserAddress(String uid, String location) {
        this.uid = uid;
        this.location = location;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "uid='" + uid + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
