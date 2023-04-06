package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.service.OrderService;
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
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.login();
//        userService.logout();

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
