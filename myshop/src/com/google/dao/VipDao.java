package com.google.dao;

import com.google.entity.User;

import java.util.List;

public interface VipDao {
    int save(User user);
    //注册查看后台有没有输入的名字
    List<User> findUser(String name);
    //登入验证
    boolean login(String name, String password);
}
