package com.github.franklinthree.bank.test;

import com.github.franklinthree.bank.pojo.Account;
import com.github.franklinthree.bank.service.AccountService;
import com.github.franklinthree.bank.service.impl.IsolationService1;
import com.github.franklinthree.bank.service.impl.IsolationService2;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.support.CallbackPreferringPlatformTransactionManager;

import java.io.IOException;

/**
 * 春天tx测试
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className SpringTxTest
 * @see
 * @since 1.0.0
 */
public class SpringTxTest {
    @Test
    public void testIsolation1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 i1 = applicationContext.getBean("i1", IsolationService1.class);
        i1.getByActno("act-010");
    }

    @Test
    public void testIsolation2() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        Account account = new Account("act-010",60404.0);
        i2.save(account);
    }
    @Test
    public void testPropagation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 获取1号service对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account account = new Account("act-003",6000.0);
        accountService.save(account);
    }
    @Test
    public void testSpringTx(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 100.0);
            System.out.println("转账成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("转账失败");
        }
    }
}
