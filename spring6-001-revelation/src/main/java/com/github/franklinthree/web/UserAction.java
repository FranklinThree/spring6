package com.github.franklinthree.web;

import com.github.franklinthree.service.UserService;
import com.github.franklinthree.service.impl.UserServiceImpl;

/**
 * 表示层
 * @author franklin3
 * @version 1.0
 * @className UserAction
 * @since 1.0
 */
public class UserAction {
    private UserService userService = new UserServiceImpl();
    /**
     * 删除用户信息请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }
}
