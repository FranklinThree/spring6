package com.github.franklinthree.spring6.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 安全方面
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className SecurityAspect
 * @see
 * @since 1.0.0
 */
@Component
@Aspect
@Order(2)
public class SecurityAspect { // 安全切面

    // 通知 + 切点
    // 前置通知
    @Before("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void before(){
        System.out.println("安全：前置通知");
    }

    // 后置通知
    @AfterReturning("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void afterReturning(){
        System.out.println("安全：后置通知");
    }

}
