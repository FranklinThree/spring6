package com.github.franklinthree.spring6.test;


import com.github.franklinthree.spring6.bean.User;
import com.github.franklinthree.spring6.dao.UserDaoImpl4MySQL;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstSpringTest {
    @Test
    public void testBeginInitBean(){
        //注意：不是在调用GetBean()方法的时候创建对象，执行一下代码的时候，就会实例化对象。
        new ClassPathXmlApplicationContext("spring6.xml");
    }
    @Test
    public void testBeanFactory(){
        //ApplicationContext接口的超级父接口是：BeanFactory（翻译为Bean工厂，就是能够生产Bean对象的一个工厂对象
        //BeanFactory实时IoC容器的顶级接口。
        //Spring的IoC容器底层实际上就是使用了：工厂模式
        //Spring底层的IoC是怎么实现的？XML解析+工厂模式+反射机制
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        User user = applicationContext.getBean("userBean",User.class);
        System.out.println(user);
    }
    @Test
    public void testXmlPath(){
        //FileSystemXmlApplicationContext 不是从类路径当中加载资源。
        //bean
        // 这种方式很少用，了解即可。
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\Programming\\Java\\Spring\\spring6\\spring6-002-first\\src\\main\\resources\\spring6.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }
    @Test
    public void testFirstSpringCode(){
        //第一步：获取Spring容器对象
        //ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个spring上下文对象。
        //这行代码只要执行，就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器当中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        //第二步：根据bean的id从Spring容器中获取这个对象
        UserDaoImpl4MySQL userBean = applicationContext.getBean("userBean", UserDaoImpl4MySQL.class);
        userBean.insert();
        System.out.println(userBean);

        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);


//        Date nowTime = (Date) applicationContext.getBean("nowTime");
        //不想使用强制类型转换，可以使用以下代码（通过第二个参数来指定返回的bean的类型）
        Date nowTime = applicationContext.getBean("nowTime",Date.class);

        System.out.println(nowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strNowTime = sdf.format(nowTime);
        System.out.println(strNowTime);

    }
}
