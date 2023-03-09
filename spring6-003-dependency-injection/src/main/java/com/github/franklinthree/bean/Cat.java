package com.github.franklinthree.bean;

/**
 * 猫
 *
 * @author FranklinThree
 * @date 2023/03/09
 * @className Cat
 * @see
 * @since 1.0.0
 */
public class Cat {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
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
