package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.Order;
import com.github.franklinthree.spring6.bean.Student;
import com.github.franklinthree.spring6.bean.User;
import com.github.franklinthree.spring6.bean.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 如果没有配置bean的id，那么默认是类名首字母小写
        User userBean = applicationContext.getBean("user", User.class);
        Vip vipBean = applicationContext.getBean("vip", Vip.class);
        Order orderBean = applicationContext.getBean("order", Order.class);
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(orderBean);
        System.out.println(studentBean);
    }
}
