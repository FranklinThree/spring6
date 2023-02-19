package com.github.franklinthree.service;


import com.github.franklinthree.dao.UserDao;
import com.github.franklinthree.dao.VipDao;

/**
 * 客户服务
 *
 * @author $AUTHER$
 * @date 2023/02/19
 * @className CustomerService
 * @see
 * @since 1.0.0
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;


    /**
     * 客户服务
     *
     * @param userDao 用户Dao
     * @param vipDao  贵宾Dao
     */
    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }


    /**
     * 保存
     */
    public void save(){

    }
}
