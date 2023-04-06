package com.github.franklinthree.spring6.service;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.github.franklinthree.spring6.service")  // 扫描包
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启AspectJ自动代理
public class Spring6Config {
}
