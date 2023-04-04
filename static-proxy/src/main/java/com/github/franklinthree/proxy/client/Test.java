package com.github.franklinthree.proxy.client;

import com.github.franklinthree.proxy.service.OrderService;
import com.github.franklinthree.proxy.service.OrderServiceImpl;
import com.github.franklinthree.proxy.service.OrderServiceImplSub;

public class Test {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImplSub();
        orderService.generate();
        orderService.modify();
        orderService.detail();
    }
}
