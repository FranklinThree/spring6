package com.github.franklinthree.proxy.client;

import com.github.franklinthree.proxy.service.TimeMethodInterceptor;
import com.github.franklinthree.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        // 创建字节码增强对象
        // 这个对象是CGLIB库当中的核心对象，就是依靠它来生成代理类。
        Enhancer enhancer = new Enhancer();

        // 告诉CGLIB父类是谁，告诉CGLIB目标类是谁
        enhancer.setSuperclass(UserService.class);

        // 设置回调函数（等同于JDK动态代理当中的调用处理器。InvocationHandler）
        enhancer.setCallback(new TimeMethodInterceptor());

        // 创建代理对象
        // 这一步会做两件事：
        // 1.在内存中生成目标类的子类，其实就是代理类的字节码class。
        // 2.创建代理对象。
        // 父类是UserService，子类这个代理类一定是UserService
        UserService userServiceProxy = (UserService) enhancer.create();

        // 建议大家能够把CGLIB动态代理生成的大力对象的名字格式有点印象。
        // 根据这个名字可以推测框架是否使用了CGLIB动态代理。
        // com.github.franklinthree.proxy.service.UserService$$EnhancerByCGLIB$$6dab6c70@2d6d8735
        System.out.println(userServiceProxy);


        // 代理对象调用方法
        boolean success = userServiceProxy.login("admin", "123456");
        System.out.println(success ? "登录成功" : "登录失败");

        userServiceProxy.logout();
    }
}
