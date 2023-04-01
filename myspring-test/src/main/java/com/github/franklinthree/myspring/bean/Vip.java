package com.github.franklinthree.myspring.bean;

/**
 * 贵宾
 *
 * @author FranklinThree
 * @date 2023/04/02
 * @className Vip
 * @see
 * @since 1.0.0
 */
public class Vip {
    private String name;
    private int age;
    private double height;

    @Override
    public String toString() {
        return "Vip{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
                ",\n\t" + "height=" + height +
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
