package com.github.franklinthree.service.impl;

import com.github.franklinthree.dao.UserDao;
import com.github.franklinthree.dao.impl.UserDaoImplForMySQL;
import com.github.franklinthree.service.UserService;

/**
 * @author franklin3
 * @version 1.0
 * @className UserServiceImpl
 * @since 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImplForMySQL();
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }


}
