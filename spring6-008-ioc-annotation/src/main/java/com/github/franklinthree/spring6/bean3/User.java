package com.github.franklinthree.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className User
 * @see
 * @since 1.0.0
 */
@Component
public class User {
//    @Value("隔壁老王")
    private String name;

//    @Value("30")
    private int age;

    public User(@Value("隔壁老王") String name,@Value("35") int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    @Value("隔壁老王")
//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    @Value("33")
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "User{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
                '\n' + '}';
    }
}
