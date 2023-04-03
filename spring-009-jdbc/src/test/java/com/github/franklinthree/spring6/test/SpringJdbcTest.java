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
    private final JdbcTemplate jdbcTemplate;
    public SpringJdbcTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(template);
        jdbcTemplate = template;
    }
    @Test
    public void testInsert(){
        // insert语句
        String sql = "insert into t_user(real_name, age) values(?, ?)";
        // 注意：在JdbcTemplate中，只要是insert delete update都是用update方法。
        int count = jdbcTemplate.update(sql, "阿三", 3);
        System.out.println(count);
    }

    @Test
    public void testJdbc(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
//        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
//        System.out.println(jdbcTemplate);
    }
}
