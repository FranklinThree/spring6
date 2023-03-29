package com.github.franklinthree.reflect;

/**
 * 测试
 *
 * @author FranklinThree
 * @date 2023/03/29
 * @className Test
 * @see
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        // 不使用反射机制调用这些方法
        SomeService service = new SomeService();
        service.doSome();

        /**
         * 分析：调用一个方法，当中含有几个要素？4要素
         * 1. 调用的是哪个对象的方法？service
         * 2. 调用的是哪个方法？doSome
         * 3. 方法传什么参数？有，String s
         * 4. 方法返回什么值？有，String
         * 调用哪个对象的哪个方法，传什么参数，返回什么值。
         * 即使是是反射机制调用方法，也同样需要具备这四个要素。
         */
        String s1 = service.doSome("张三");
        System.out.println(s1);

        String s2 = service.doSome("李四", 250);
        System.out.println(s2);
    }
}
