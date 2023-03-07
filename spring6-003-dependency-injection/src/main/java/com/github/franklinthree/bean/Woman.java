package com.github.franklinthree.bean;

public class Woman {
    private String name;

    @Override
    public String toString() {
        return "Woman{" +
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
