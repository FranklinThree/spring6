package com.github.franklinthree.spring6.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
        //第一步：获取Spring容器对象
        //ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个spring上下文对象。
        //这行代码只要执行，就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器当中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        //第二步：根据bean的id从Spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);

    }
}
