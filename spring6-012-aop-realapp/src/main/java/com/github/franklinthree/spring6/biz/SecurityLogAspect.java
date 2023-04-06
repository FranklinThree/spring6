package com.github.franklinthree.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * 安全日志方面
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className SecurityLogAspect
 * @see
 * @since 1.0.0
 */
@Component
@Aspect
public class SecurityLogAspect {

    @Pointcut("execution(* com.github.franklinthree.spring6.biz..save*(..))")
    public void savePointCut(){}

    @Pointcut("execution(* com.github.franklinthree.spring6.biz..delete*(..))")
    public void deletePointCut(){}

    @Pointcut("execution(* com.github.franklinthree.spring6.biz..modify*(..))")
    public void modifyPointCut(){}


    @Before("savePointCut() || deletePointCut() || modifyPointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = sdf.format(new Date());
        System.out.println(nowTime + " zhangsan : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "()");
    }
}
