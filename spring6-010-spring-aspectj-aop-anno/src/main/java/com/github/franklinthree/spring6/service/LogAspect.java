package com.github.franklinthree.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 日志方面
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className LogAspect
 * @see
 * @since 1.0.0
 */
@Component
@Aspect // 切面类是需要使用@Aspect注解标注的
@Order(1)
public class LogAspect {    // 切面

    // 切面 = 通知 + 切点
    // 通知就是增强，就是具体的要编写的增强代码
    // 这里通知Advice以方法的形式出现。（因为方法中可以写代码）
    // @Before注解标注的方法就是一个前置通知
//    @Before("execution(* com.github.franklinthree.spring6.service..*(..))")
//    public void zenQiang(){
//        System.out.println("我是一段增强代码");
//    }

    // 前置通知
    @Before("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void before(){
        System.out.println("前置通知");
    }
    // 后置通知
    @AfterReturning("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void afterReturning(){
        System.out.println("后置通知");
    }
    // 环绕通知（环绕是最大的通知，在前置通知之前，在后置通知之后。）
    @Around("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        // 前面的代码
        System.out.println("前环绕");
        // 执行目标
        joinPoint.proceed();    // 执行目标方法
        // 后面的代码
        System.out.println("后环绕");
    }
    // 异常通知
    @AfterThrowing("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void afterThrowing(){
        System.out.println("异常通知");
    }
    // 最终通知（finally语句块中的通知）
    @After("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void after(){
        System.out.println("最终通知");
    }


}
