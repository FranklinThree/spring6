package com.github.franklinthree.bean;

/**
 * 学生
 *
 * @author FranklinThree
 * @date 2023/03/06
 * @className Student
 * @see
 * @since 1.0.0
 */
public class Student {
    private String name;

    private Clazz clazz;

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "clazz=" + clazz +
                '\n' + '}';
    }

}
