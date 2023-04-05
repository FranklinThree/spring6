package com.github.franklinthree.proxy.service;

/**
 * 用户服务
 *
 * @author FranklinThree
 * @date 2023/04/05
 * @className UserService
 * @see
 * @since 1.0.0
 */
public class UserService {
    // 目标方法
    public boolean login(String username, String password){
        System.out.println("系统正在验证身份...");
        if ("admin".equals(username) && "123456".equals(password)) {
            System.out.println("身份验证成功");
            return true;
        } else {
            System.out.println("身份验证失败");
            return false;
        }

    }
    public boolean logout(){
        System.out.println("用户退出登录");
        return true;
    }

}
