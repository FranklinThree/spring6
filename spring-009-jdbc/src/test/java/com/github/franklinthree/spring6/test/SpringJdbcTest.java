package com.github.franklinthree.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * spring jdbc测试
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className SpringJdbcTest
 * @see
 * @since 1.0.0
 */
public class SpringJdbcTest {
    @Test
    public void testJdbc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
}
