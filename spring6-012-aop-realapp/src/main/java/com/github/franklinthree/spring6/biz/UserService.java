package com.github.franklinthree.spring6.biz;

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
public class UserService {

    public void saveUser(){
        System.out.println("保存用户...");
    }

    public void modifyUser(){
        System.out.println("修改用户...");
    }

    public void deleteUser(){
        System.out.println("删除用户...");
    }

    public void queryUser(){
        System.out.println("查询用户...");
    }
}
