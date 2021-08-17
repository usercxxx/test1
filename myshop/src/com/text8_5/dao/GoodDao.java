package com.text8_5.dao;

import com.text8_5.util.good;

public interface GoodDao {
    public int add(String name,float price);
    public int delete(int id);
    public void show();
    public int change(good goods);
}
