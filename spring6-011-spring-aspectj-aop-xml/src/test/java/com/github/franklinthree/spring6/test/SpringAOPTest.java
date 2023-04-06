package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 春天aoptest
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className SpringAOPTest
 * @see
 * @since 1.0.0
 */
public class SpringAOPTest {

    @Test
    public void testXML(){
        // 1. 创建Spring的IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 2. 从IOC容器中获取bean的实例
        UserService userService = applicationContext.getBean("userService", UserService.class);
        // 3. 使用bean
        userService.logout();
    }
}
