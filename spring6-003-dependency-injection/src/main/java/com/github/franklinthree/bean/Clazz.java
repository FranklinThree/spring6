package com.github.franklinthree.bean;

/**
 * 班级
 *
 * @author FranklinThree
 * @date 2023/03/06
 * @className Clazz
 * @see
 * @since 1.0.0
 */
public class Clazz {
    //班级名称
    private String name;


    //使用级联属性赋值，需要这个get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "\n\t" + "name='" + name + '\'' +
                '\n' + '}';
    }
}
