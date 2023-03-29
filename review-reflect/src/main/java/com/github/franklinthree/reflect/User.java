package com.github.franklinthree.reflect;

/**
 * 用户
 *
 * @author FranklinThree
 * @date 2023/03/29
 * @className User
 * @see
 * @since 1.0.0
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
                '\n' + '}';
    }
}
