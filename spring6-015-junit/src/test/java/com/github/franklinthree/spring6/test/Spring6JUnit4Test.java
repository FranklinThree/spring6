package com.github.franklinthree.spring6.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.github.franklinthree.spring6.bean.User;
import org.springframework.test.context.ContextConfiguration;

/**
 * spring6 junit4测试
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className Spring6JUnit4Test
 * @see
 * @since 1.0.0
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.github.franklinthree.spring6.Spring6Config.class)
//xml模式下使用
//@ContextConfiguration(locations = "classpath:spring.xml")
public class Spring6JUnit4Test {

    @Autowired
    private User user;

    @Test
    public void testUser(){
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.franklinthree.spring6");
//        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }
}
