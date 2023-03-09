package com.github.franklinthree.spring6.test;

import com.github.franklinthree.bean.*;
import com.github.franklinthree.jdbc.MyDataSource;
import com.github.franklinthree.service.CustomerService;
import com.github.franklinthree.service.OrderService;
import com.github.franklinthree.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean.getName().toUpperCase());
    }
    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }
    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian = applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);

    }
    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(studentBean);
        System.out.println(clazzBean);
    }
    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
    @Test
    public void testSimpleTypeSet2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);

    }
    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("userBean",User.class);
        System.out.println(user);
    }
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
