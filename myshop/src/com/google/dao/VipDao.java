package com.google.dao;

import com.google.entity.User;

import java.util.List;

public interface VipDao {
    int save(User user);
    //ע��鿴��̨��û�����������
    List<User> findUser(String name);
    //������֤
    boolean login(String name, String password);
}
