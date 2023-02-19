package com.github.franklinthree.spring6.test;

import com.github.franklinthree.service.CustomerService;
import com.github.franklinthree.service.OrderService;
import com.github.franklinthree.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderService.generate();

        OrderService orderService2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderService2.generate();
    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("csBean", CustomerService.class);
        customerService.save();

        CustomerService customerService2 = applicationContext.getBean("csBean2", CustomerService.class);
        customerService2.save();

        CustomerService customerService3 = applicationContext.getBean("csBean3", CustomerService.class);
        customerService3.save();
    }
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean",UserService.class);
        userService.saveUser();
    }
}
