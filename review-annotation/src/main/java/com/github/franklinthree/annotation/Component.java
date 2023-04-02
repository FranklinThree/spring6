package com.github.franklinthree.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className Component
 * @see
 * @since 1.0.0
 */

// 用于描述注解的使用范围（即：被描述的注解可以用在什么地方）
// 以下表示该注解可以用在类上，也可以用在属性上
//@Target(value = {ElementType.TYPE, ElementType.FIELD})

// 以下表示该注解只能用在类上
//@Target(value = {ElementType.TYPE})

// 使用某个注解的时候，如果注解的属性值是数组并且数组中只有一个值，那么可以省略花括号
@Target(ElementType.TYPE)
// 用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
// 以下表示该注解最终保留到class文件中，并被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)

public @interface Component {

    // 定义注解的属性
    // String是属性的类型，value是属性的名称
    String value();

    // String是属性的类型，name是属性的名称
//    String name();

//    String[] names();
//    int[] ages();


}
