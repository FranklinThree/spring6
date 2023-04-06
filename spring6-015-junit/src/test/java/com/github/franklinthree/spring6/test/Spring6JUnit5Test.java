package com.github.franklinthree.spring6.test;

import com.github.franklinthree.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * spring6 junit5测试
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className Spring6JUnit5Test
 * @see
 * @since 1.0.0
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = com.github.franklinthree.spring6.Spring6Config.class)
public class Spring6JUnit5Test {

    @Autowired
    private User user;
    @Test
    public void testUser(){
        System.out.println(user);
    }
}
