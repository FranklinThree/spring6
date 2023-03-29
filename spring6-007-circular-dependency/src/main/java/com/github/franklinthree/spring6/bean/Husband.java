package com.github.franklinthree.spring6.bean;

/**
 * 丈夫
 *
 * @author FranklinThree
 * @date 2023/03/28
 * @className Husband
 * @see
 * @since 1.0.0
 */
public class Husband {
    private String name;
    private Wife wife;

    public Husband() {
    }

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "\n\t" + "name='" + name + '\'' +
                ",\n\t" + "wife=" + wife.getName() +
                '\n' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
