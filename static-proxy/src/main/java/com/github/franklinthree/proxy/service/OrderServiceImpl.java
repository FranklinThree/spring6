package com.github.franklinthree.proxy.service;

/**
 * 订单服务impl
 *
 * @author FranklinThree
 * @date 2023/04/04
 * @className OrderServiceImpl
 * @see
 * @since 1.0.0
 */
public class OrderServiceImpl implements OrderService {

    /*
    * 项目经理提出一个新的需求：要统计所有业务接口中每一个业务方法的耗时。
    * 解决方案一：硬编码，在每一个业务接口中的每一个业务方法中直接添加统计耗时的代码。
    * 这种方案的缺点：
    *   缺点一：违背了OCP开闭原则，如果有新的业务方法，就需要在每一个业务方法中添加耗时统计的代码。
    *   缺点二：代码没有复用性，如果有新的业务接口，就需要在每一个业务接口中添加耗时统计的代码。
    * 解决方案二：编写业务类的子类，让子类继承业务类，然后在子类中重写业务方法，在重写的业务方法中添加耗时统计的代码。
    *   缺点一：虽然解决了OCP开闭原则的问题，但是这种方式会导致耦合度很高，因为采用了继承关系。继承关系是一种强耦合关系，不建议使用。
    *   缺点二：代码没有复用性，如果有新的业务接口，就需要在每一个业务接口中添加耗时统计的代码。
    * 解决方案三：采用静态代理的方式，编写代理类，让代理类实现业务接口，然后在代理类中持有业务类的对象，然后在代理类中重写业务方法，在重写的业务方法中添加耗时统计的代码。
    *
    * */
//    @Override
//    public void generate() {
//        // 模拟生成订单的耗时
//        long begin = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("生成订单");
//        System.out.println("耗时：" + (end - begin) + "ms");
//    }
//
//    @Override
//    public void modify() {
//        // 模拟修改订单的耗时
//        long begin = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("修改订单");
//        System.out.println("耗时：" + (end - begin) + "ms");
//    }
//
//    @Override
//    public void detail() {
//        // 模拟查看订单详情的耗时
//        long begin = System.currentTimeMillis();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("查看订单详情");
//        System.out.println("耗时：" + (end - begin) + "ms");
//    }

    @Override
    public void generate() {
        // 模拟生成订单的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生成订单");
    }

    @Override
    public void modify() {
        // 模拟修改订单的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("修改订单");
    }

    @Override
    public void detail() {
        // 模拟查看订单详情的耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查看订单详情");
    }
}

