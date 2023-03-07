package com.github.franklinthree.bean;

import java.util.List;
import java.util.Set;

/**
 * 人
 *
 * @author FranklinThree
 * @date 2023/03/07
 * @className Person
 * @see
 * @since 1.0.0
 */
public class Person {
    // 注入List集合
    private List<String> names;

    // 注入Set集合
    private Set<String> addrs;

    @Override
    public String toString() {
        return "Person{" +
                "\n\t" + "names=" + names +
                ",\n\t" + "addrs=" + addrs +
                '\n' + '}';
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Set<String> getAddrs() {
        return addrs;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }
}
