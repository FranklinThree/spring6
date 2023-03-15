package com.github.franklinthree;

import com.github.franklinthree.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        /**
         * 1. Spring默认情况下是如何管理这个Bean的：
         *      默认情况下，Spring容器中的Bean是单例的（Singleton）
         *      在Spring上下文初始化的时候，Spring容器中的Bean就已经初始化好了
         *      每一次调用getBean方法，都是从Spring容器中获取的同一个Bean
         * 2. Spring容器中的Bean的作用域
         *      当将bean的scope属性设置为singleton时，Spring容器中的Bean是单例的（Singleton）
         *      当将bean的scope属性设置为prototype时，Spring容器中的Bean是多例的（Prototype）
         *      每一次调用getBean方法，实例化一个新的Bean
         *      prototype（原型）
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
//        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb);
//
//        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb2);
//
//        SpringBean sb3 = applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb3);


    }
}
