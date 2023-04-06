package com.github.franklinthree.bank.test;

import com.github.franklinthree.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
