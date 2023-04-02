package com.github.franklinthree.client;

import com.github.franklinthree.annotation.Component;
import com.github.franklinthree.bean.User;

public class ReflectAnnotationTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 获取类的字节码对象
        Class aClass = Class.forName("com.github.franklinthree.bean.User");

        if (aClass.isAnnotationPresent(Component.class)) {
            // 获取注解
            Component component = (Component) aClass.getAnnotation(Component.class);
            // 获取注解上的属性值
            System.out.println(component.value());

        }
    }
}
