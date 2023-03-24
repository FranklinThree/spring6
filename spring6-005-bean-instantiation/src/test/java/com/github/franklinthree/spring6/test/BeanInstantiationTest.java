package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiationTest {
	@Test
	public void testInstantiation() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
		System.out.println(sb);
	}
}
