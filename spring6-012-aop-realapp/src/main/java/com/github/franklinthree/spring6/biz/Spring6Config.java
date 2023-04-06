package com.github.franklinthree.spring6.biz;

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
@ComponentScan({"com.github.franklinthree.spring6.biz"})
public class Spring6Config {
}
