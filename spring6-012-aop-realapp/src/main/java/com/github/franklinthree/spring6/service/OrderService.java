package com.github.franklinthree.spring6.service;

import org.springframework.stereotype.Service;

/**
 * 订单服务
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className OrderService
 * @see
 * @since 1.0.0
 */
@Service
public class OrderService {

    // 生成订单的业务方法
    public void generate(){
        System.out.println("生成订单...");
    }

    // 取消订单的业务方法
    public void cancel(){
        System.out.println("取消订单...");
        String s = null;
        s.toString();
    }
}
