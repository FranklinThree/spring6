package com.github.franklinthree.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 事务方面
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className TransactionAspect
 * @see
 * @since 1.0.0
 */
@Component
@Aspect
public class TransactionAspect {

    // 编程式事务解决方案
    @Around("execution(* com.github.franklinthree.spring6.service.*Service.*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        try{
            // 前环绕
            System.out.println("开启事务");
            // 执行目标
            joinPoint.proceed();
            // 后环绕
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }
    }
}
