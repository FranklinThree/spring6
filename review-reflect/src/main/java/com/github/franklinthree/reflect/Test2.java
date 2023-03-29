package com.github.franklinthree.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * test2
 *
 * @author FranklinThree
 * @date 2023/03/29
 * @className Test2
 * @see
 * @since 1.0.0
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 使用反射机制调用这些方法
        // 获取类
        Class<?> aClass = Class.forName("com.github.franklinthree.reflect.SomeService");

        // 获取方法
        Method doSomeMethod = aClass.getDeclaredMethod("doSome", String.class, int.class);

        // 调用方法
        // 四要素：调用哪个对象的哪个方法，传什么参数，返回什么值。
        // 哪个对象 obj
        // 哪个方法 doSomeMethod
        // 传什么参数 "张三", 250
        // 返回什么值 retValue
        Constructor<?> con = aClass.getDeclaredConstructor();
        Object obj = con.newInstance();

        Object retValue = doSomeMethod.invoke(obj, "张三", 250);
        System.out.println(retValue);
    }
}
