package com.github.franklinthree.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 计时器方面
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className TimerAspect
 * @see
 * @since 1.0.0
 */
public class TimerAspect {
    // 通知

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前环绕
        long begin = System.currentTimeMillis();
        // 目标方法
        joinPoint.proceed();
        // 后环绕
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));

    }
}
