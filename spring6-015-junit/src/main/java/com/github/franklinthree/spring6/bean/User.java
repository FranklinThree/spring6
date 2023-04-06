package com.github.franklinthree.spring6.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className User
 * @see
 * @since 1.0.0
 */
@Component
public class User {
    @Value("FranklinThree")
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n\t" + "name='" + name + '\'' +
                '\n' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
