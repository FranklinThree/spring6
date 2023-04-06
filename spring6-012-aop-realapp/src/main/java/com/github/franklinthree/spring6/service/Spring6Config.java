package com.github.franklinthree.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * spring6配置
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className Spring6Config
 * @see
 * @since 1.0.0
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.github.franklinthree.spring6.service")
public class Spring6Config {
}
