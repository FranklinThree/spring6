package com.github.franklinthree.bank.test;

import com.github.franklinthree.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 银行tx测试
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className BankTxTest
 * @see
 * @since 1.0.0
 */
public class BankTxTest {

    @Test
    public void testNoAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("act-001", "act-002",1.0);
    }
}
