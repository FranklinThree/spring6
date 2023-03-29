package com.github.franklinthree.spring6.bean;

/**
 * 妻子
 *
 * @author FranklinThree
 * @date 2023/03/28
 * @className Wife
 * @see
 * @since 1.0.0
 */
public class Wife {
    private String name;
    private Husband husband;

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "husband=" + husband.getName() +
                '\n' + '}';
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Husband getHusband() {
        return husband;
    }

//    public void setHusband(Husband husband) {
//        this.husband = husband;
//    }
}
