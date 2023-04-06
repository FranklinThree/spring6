package com.github.franklinthree.spring6.service;

import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className UserService
 * @see
 * @since 1.0.0
 */
@Service
public class UserService { // 目标类型
    public void login(){ // 目标方法
        System.out.println("用户登录");
    }

    public boolean logout(){
        System.out.println("用户退出");
        return true;
    }
}
