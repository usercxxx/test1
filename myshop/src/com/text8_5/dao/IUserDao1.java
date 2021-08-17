package com.text8_5.dao;

import com.text8_5.util.User;

public interface IUserDao1 {
	public boolean login(User stu);
    public int add(String Id ,String name,String pwd);
    public int delete(int id);
    public void show();
    public int buy(User user,int id);
    public int change(User stu);
}
