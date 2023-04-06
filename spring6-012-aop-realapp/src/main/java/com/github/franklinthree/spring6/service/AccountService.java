package com.github.franklinthree.spring6.service;

import org.springframework.stereotype.Service;

/**
 * 帐户服务
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountService
 * @see
 * @since 1.0.0
 */
@Service
public class AccountService {
    // 转账的业务方法
    public void transfer(){
        System.out.println("转账...");
    }

    // 取款的业务方法
    public void withdraw(){
        System.out.println("取款...");
    }
}
