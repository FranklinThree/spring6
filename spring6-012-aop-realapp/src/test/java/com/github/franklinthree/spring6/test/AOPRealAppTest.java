package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.biz.UserService;
import com.github.franklinthree.spring6.biz.VipService;
import com.github.franklinthree.spring6.service.AccountService;
import com.github.franklinthree.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * aopreal应用测试
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AOPRealAppTest
 * @see
 * @since 1.0.0
 */
public class AOPRealAppTest {

    @Test
    public void testSecurityLog(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.franklinthree.spring6.biz");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        VipService vipService = applicationContext.getBean("vipService", VipService.class);

        userService.saveUser();
        userService.modifyUser();
        userService.deleteUser();
        userService.queryUser();

        vipService.saveUser();
        vipService.modifyUser();
        vipService.deleteUser();
        vipService.queryUser();
    }
    @Test
    public void testTransaction(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.github.franklinthree.spring6.service");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        accountService.transfer();
        accountService.withdraw();

        orderService.generate();
        orderService.cancel();
    }
}
