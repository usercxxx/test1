package com.google.service;

import com.google.entity.User;

public interface VipService {
    boolean  checkUser(String name) ;
    boolean  login(String name,String password) ;

    int save(User user);
}
