package com.google.service.impl;

import com.google.dao.VipDao;
import com.google.dao.impi.BaseDaoImpI;
import com.google.dao.impi.VipDaoIpml;
import com.google.entity.User;
import com.google.service.VipService;

import java.util.List;

public class VipServiceIpml extends BaseDaoImpI implements VipService {
    private VipDao vipDao= (VipDao) new VipDaoIpml();
    @Override
    public int save(User user) {

        return vipDao.save(user);
    }

    @Override
    public  boolean checkUser(String name) {
        List<User> users = vipDao.findUser(name);
        return users.size()>0;
    }

    @Override
    public boolean login(String name, String password) {
        return false;
    }
}
