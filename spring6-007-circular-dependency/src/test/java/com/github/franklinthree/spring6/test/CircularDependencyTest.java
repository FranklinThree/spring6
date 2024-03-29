package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.Husband;
import com.github.franklinthree.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {
    @Test
    public void testCircularDependency2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Husband husband = applicationContext.getBean("h", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("w", Wife.class);
        System.out.println(wife);
    }
    @Test
    public void testCircularDependency(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);
    }
}
