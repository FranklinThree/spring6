package com.github.franklinthree.proxy.client;

import com.github.franklinthree.proxy.service.OrderService;
import com.github.franklinthree.proxy.service.OrderServiceImpl;
import com.github.franklinthree.proxy.service.OrderServiceImplSub;

public class Test {
    public static void main(String[] args) {
//        OrderService orderService = new OrderServiceImplSub();
//        orderService.generate();
//        orderService.modify();
//        orderService.detail();

        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceImplSub();
        // 代理对象调用目标对象的方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
