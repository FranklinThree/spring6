package com.github.franklinthree.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.github.franklinthree.spring6.bean.User;

public class BeanLifecycleTest {

    /**
     * 测试bean生命周期
     * Spring容器只对singleton的Bean进行完整的生命周期管理
     * 如果是prototype的Bean，Spring容器只会调用Bean的初始化完毕。等客户端程序一旦获取到该Bean实例之后，Spring容器就不会再管理该Bean的生命周期了。
     */
    @Test
    public void testBeanLifecycleFive(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步：使用Bean："+user);
        // 注意：这里需要手动关闭容器，否则不会调用Bean的销毁方法。
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
