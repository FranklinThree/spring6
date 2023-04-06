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
    public void generate(){
        System.out.println("订单生成");
//        if (true){
//            throw new RuntimeException("运行时异常");
//        }
    }
}
