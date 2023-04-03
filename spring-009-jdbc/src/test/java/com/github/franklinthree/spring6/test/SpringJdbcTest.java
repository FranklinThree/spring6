package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public void testBatchUpdate(){
        // update语句
        String sql = "update t_user set real_name = ?,age = ? where id = ?";
        Object[][] objects = {{"小张三", 10, 1}, {"小李四", 20, 2}, {"小王五", 30, 3}};
        List<Object[]> list = Arrays.stream(objects).toList();
        int[] count = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(count));


    }
    @Test
    public void testBatchInsert(){
        // insert语句
        String sql = "insert into t_user(real_name, age) values(?, ?)";
        Object[][] objects = {{"小张三", 10}, {"小李四", 20}, {"小王五", 30}};
        List<Object[]> list = Arrays.stream(objects).toList();
        // 注意：在JdbcTemplate中，只要是insert delete update都是用update方法。
        int[] count = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(count));
    }

    @Test
    public void testQueryOneValue(){
        // select语句
        String sql = "select count(*) from t_user";
        // 注意：在JdbcTemplate中，只要是insert delete update都是用update方法。
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
    @Test
    public void testQueryAll(){
        // select语句
        String sql = "select id, real_name ,age from t_user";
        // 注意：在JdbcTemplate中，只要是insert delete update都是用update方法。
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(query);
    }

    @Test
    public void testQueryOne(){
        // select语句
        String sql = "select id, real_name ,age from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 2);
        System.out.println(user);
    }
    @Test
    public void testDelete(){
        // delete语句
        String sql = "delete from t_user where id = ?";
        int count = jdbcTemplate.update(sql, 4);
        System.out.println(count);
    }

    @Test
    public void testUpdate(){
        // update语句
        String sql = "update t_user set real_name = ?, age = ? where id = ?";
        int count = jdbcTemplate.update(sql, "阿三索尔", 10, 4);
        System.out.println(count);
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