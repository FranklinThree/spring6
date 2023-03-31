package com.github.franklinthree.myspring.bean;

/**
 * 用户
 *
 * @author FranklinThree
 * @date 2023/03/31
 * @className User
 * @see
 * @since 1.0.0
 */
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
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
}
