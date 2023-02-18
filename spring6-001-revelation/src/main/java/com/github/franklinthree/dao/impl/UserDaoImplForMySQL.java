package com.github.franklinthree.dao.impl;

import com.github.franklinthree.dao.UserDao;
/**
 * @author franklin3
 * @version 1.0
 * @className UserDao
 * @since 1.0
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除用户信息......");
    }
}
