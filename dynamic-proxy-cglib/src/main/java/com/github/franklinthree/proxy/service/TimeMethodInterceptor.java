package com.github.franklinthree.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前面增强
        long begin = System.currentTimeMillis();
        // 怎么调用目标对象的目标方法呢？
        Object retValue = methodProxy.invokeSuper(o, objects);
        // 后面增强
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - begin));

        return retValue;
    }
}
