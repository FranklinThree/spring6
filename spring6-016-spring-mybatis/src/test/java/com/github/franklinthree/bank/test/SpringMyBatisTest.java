package com.github.franklinthree.bank.test;

import com.github.franklinthree.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 春天我batis测试
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className SpringMyBatisTest
 * @see
 * @since 1.0.0
 */
public class SpringMyBatisTest {
    @Test
    public void testSpringMybatis() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 100.0);
            System.out.println("转账成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
