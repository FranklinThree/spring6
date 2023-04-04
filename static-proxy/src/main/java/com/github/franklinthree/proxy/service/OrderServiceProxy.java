package com.github.franklinthree.proxy.service;

/**
 * 订单服务代理
 *
 * @author FranklinThree
 * @date 2023/04/04
 * @className OrderServiceProxy
 * @see
 * @since 1.0.0
 */
// 代理对象（代理对象和目标对象要具有相同的行为，就要实现同一个或同一些接口。）
    // 客户端在使用代理对象的时候，就会觉得代理对象就是目标对象，因为代理对象具有目标对象的行为。
public class OrderServiceProxy implements OrderService{
    // 持有目标对象
    // 将目标对象作为代理对象的一个属性，这种关系叫做关联关系。比继承关系耦合度低。
    // 注意：代理对象和目标对象要实现同一个或同一些接口，这样才能保证代理对象具有目标对象的行为。
    private OrderService target;

    public OrderServiceProxy(OrderService target) {
        this.target = target;
    }

    // 代理方法
    @Override
    public void generate() {
        // 增强
        long begin = System.currentTimeMillis();
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin) + "ms");
    }

    // 代理方法
    @Override
    public void modify() {
        // 增强
        long begin = System.currentTimeMillis();
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin) + "ms");
    }

    // 代理方法
    @Override
    public void detail() {
        // 增强
        long begin = System.currentTimeMillis();
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin) + "ms");
    }
}
