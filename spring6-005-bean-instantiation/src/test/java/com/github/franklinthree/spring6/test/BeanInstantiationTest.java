package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.Gun;
import com.github.franklinthree.spring6.bean.Person;
import com.github.franklinthree.spring6.bean.SpringBean;
import com.github.franklinthree.spring6.bean.Star;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiationTest {

	@Test
	public void testInstantiation4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person);
	}
	@Test
	public void testInstantiation3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Gun gun = applicationContext.getBean("gun", Gun.class);
		System.out.println(gun);
	}
	@Test
	public void testInstantiation2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Star star = applicationContext.getBean("star", Star.class);
		System.out.println(star);
	}
	@Test
	public void testInstantiation1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
		System.out.println(sb);
	}
}
