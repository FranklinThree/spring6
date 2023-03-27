package com.github.franklinthree.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 日志bean后置处理程序
 *
 * @author FranklinThree
 * @date 2023/03/27
 * @className LogBeanPostProcessor
 * @see BeanPostProcessor
 * @since 1.0.0
 */
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行BeanPostProcessor的postProcessBeforeInitialization方法。");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行BeanPostProcessor的postProcessAfterInitialization方法。");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
