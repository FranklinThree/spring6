package com.github.franklinthree.bean;

public class People {
    private String name;
    private int age;
    private boolean sex;

    @Override
    public String toString() {
        return "People{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "age=" + age +
                ",\n\t" + "sex=" + sex +
                '\n' + '}';
    }

    // c命名空间是简化构造注入的。
    // c命名空间注入办法是基于构造方法的。
    public People(String name, int age, boolean sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
