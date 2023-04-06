package com.github.franklinthree.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * spring6配置
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className Spring6Config
 * @see
 * @since 1.0.0
 */

@Configuration // 代替spring.xml配置文件，在这个类当中完成配置。
@ComponentScan(basePackages = {"com.github.franklinthree.bank"}) // 扫描包
@EnableTransactionManagement // 开启事务管理
public class Spring6Config {
    // Spring框架，看到这个@Bean注解后，会调用这个被标注的方法，这个方法的返回值是一个对象，这个对象会被Spring框架管理起来。
    // 返回的对象就是Spring框架中的一个Bean对象。
    // 并且这个Bean的名字就是dataSource。
    @Bean(name = "dataSource")
    public DruidDataSource getDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://huawei.franklin3.top:3306/spring6");
        druidDataSource.setUsername("franklin3");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){ // Spring在调用这个方法的时候，会自动的把dataSource对象注入进来。
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    @Bean(name = "txManager")
    public org.springframework.jdbc.datasource.DataSourceTransactionManager getTxManager(DataSource dataSource){
        org.springframework.jdbc.datasource.DataSourceTransactionManager txManager = new org.springframework.jdbc.datasource.DataSourceTransactionManager();
        txManager.setDataSource(dataSource);
        return txManager;
    }


}
