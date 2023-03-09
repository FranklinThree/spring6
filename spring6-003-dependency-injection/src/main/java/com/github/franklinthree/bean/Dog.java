package com.github.franklinthree.bean;

import java.util.Date;

/**
 * 狗
 *
 * @author FranklinThree
 * @date 2023/03/10
 * @className Dog
 * @see
 * @since 1.0.0
 */
public class Dog {
    // 简单类型
    private String name;
    private int age;
    // 非简单类型
    private Date birth;

    @Override
    public String toString() {
        return "Dog{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
                ",\n\t" + "birth=" + birth +
                '\n' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
