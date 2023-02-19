package com.github.franklinthree.service;

import com.github.franklinthree.dao.UserDao;
import com.github.franklinthree.dao.VipDao;

public class UserService {
    private UserDao userDao;
    private VipDao vipDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public VipDao getVipDao() {
        return vipDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    //使用set注入，必须提供一个set方法。
    //Spring容器会调用这个set方法，来给userDao属性赋值。
    public void saveUser(){
        //保存用户信息到数据库
        userDao.insert();
        vipDao.insert();
    }
}
