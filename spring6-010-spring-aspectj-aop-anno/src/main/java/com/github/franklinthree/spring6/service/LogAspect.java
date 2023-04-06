package com.github.franklinthree.spring6.service;

import org.aspectj.lang.JoinPoint;
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

    // 定义通用的切点表达式
    @Pointcut("execution(* com.github.franklinthree.spring6.service..*(..))")
    public void pointcut(){
        // 这个方法只是一个标记，方法名随意，方法体中也不需要写任何代码
    }

    // 前置通知
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知");
        // 这个JoinPoint joinPoint，在Spring容器调用这个方法的时候会自动传过来。
        // 我们可以直接用。用这个JoinPoint joinPoint干啥？
        // Signature signature = joinPoint.getSignature();获取目标方法的签名
        // 通过方法的签名，可以获取到一个方法的具体信息
        // 获取目标方法的名字
        System.out.println("目标方法名：" + joinPoint.getSignature().getName());

    }
    // 后置通知
    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("后置通知");
    }
    // 环绕通知（环绕是最大的通知，在前置通知之前，在后置通知之后。）
    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        // 前面的代码
        System.out.println("前环绕");
        // 执行目标
        joinPoint.proceed();    // 执行目标方法
        // 后面的代码
        System.out.println("后环绕");
    }
    // 异常通知
    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.out.println("异常通知");
    }
    // 最终通知（finally语句块中的通知）
    @After("pointcut()")
    public void after(){
        System.out.println("最终通知");
    }


}
