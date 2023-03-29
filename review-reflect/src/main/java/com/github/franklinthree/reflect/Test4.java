package com.github.franklinthree.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception{
        /*
        需求：
            假设你现在已知以下信息：
                1. 有这样一个类，类名叫做：com.github.franklinthree.reflect.User
                2. 这个类符合JavaBean规范，属性私有化，对外提供公开的get/set方法。
                3. 你还知道这个类当中有一个属性，属性的名字叫做 age
                4. 并且,你还知道age属性的类型是int类型。
            请使用反射机制调用相关方法，给User对象的age属性赋值。
         */
        String className = "com.github.franklinthree.reflect.User";
        String propertyName = "age";
        Class<Integer> propertyClass = int.class;

        // 通过反射机制，调用setAge(int)方法
        // 1. 获取类
        Class<?> aClass = Class.forName(className);

        // 2. 获取方法名
        String setMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);

        // 根据属性名获取属性类型
        Class<?> type = aClass.getDeclaredField(propertyName).getType();

        // 3. 获取方法
        Method setMethod = aClass.getDeclaredMethod(setMethodName, type);

        // 4. 准备对象
        Constructor<?> con = aClass.getDeclaredConstructor();
        Object obj = con.newInstance();

        // 5. 调用方法
        setMethod.invoke(obj, 30);

        System.out.println(obj);


    }
}
