package com.github.franklinthree.myspring.test;

import com.github.franklinthree.myspring.bean.OrderService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathApplicationContext;

/**
 * 我春天测试
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className MySpringTest
 * @see
 * @since 1.0.0
 */
public class MySpringTest {
    @Test
    public void testMySpring() {
        ApplicationContext applicationContext = new ClassPathApplicationContext("myspring.xml");
        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);

        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.generateOrder();
    }
}
