package com.github.franklinthree.myspring.bean;

/**
 * 用户服务
 *
 * @author FranklinThree
 * @date 2023/03/31
 * @className UserService
 * @see
 * @since 1.0.0
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
        System.out.println("UserService.save()");
    }
}
