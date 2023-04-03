package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.Order;
import com.github.franklinthree.spring6.bean.Student;
import com.github.franklinthree.spring6.bean.User;
import com.github.franklinthree.spring6.bean.Vip;
import com.github.franklinthree.spring6.bean3.MyDataSource;
import com.github.franklinthree.spring6.dao.OrderDao;
import com.github.franklinthree.spring6_2.service.OrderService;
import com.github.franklinthree.spring6_3.Spring6Config;
import com.github.franklinthree.spring6_3.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/**
 * io cannotation测试
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className IoCAnnotationTest
 * @see
 * @since 1.0.0
 */
public class IoCAnnotationTest {
    @Test
    public void testNoXML(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = annotationConfigApplicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testResource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();

    }


    @Test
    public void testAutowired(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();

    }

    @Test
    public void testDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

        com.github.franklinthree.spring6.bean3.User user = applicationContext.getBean("user", com.github.franklinthree.spring6.bean3.User.class);
        System.out.println(user);
    }
    @Test
    public void testChoose(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 如果没有配置bean的id，那么默认是类名首字母小写
        User userBean = applicationContext.getBean("user", User.class);
        Vip vipBean = applicationContext.getBean("vip", Vip.class);
        Order orderBean = applicationContext.getBean("order", Order.class);
        Student studentBean = applicationContext.getBean("student", Student.class);
//        System.out.println(userBean);
//        System.out.println(vipBean);
//        System.out.println(orderBean);
//        System.out.println(studentBean);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }
}
