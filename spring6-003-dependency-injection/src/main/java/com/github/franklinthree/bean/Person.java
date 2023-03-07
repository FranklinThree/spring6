package com.github.franklinthree.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
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


    // 注入Map集合
    // 多个电话
    private Map<Integer,String> phones;

    // 注入属性类对象
    // Properties本质上也是一个Map集合
    // Properties的父类Hashtable，Hashtable实现了Map接口
    // 虽然这个也是一个Map集合，和Map的注入方式有点像，但是不同
    // Properties的key和value只能是String类型
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "\n\t" + "names=" + names +
                ",\n\t" + "addrs=" + addrs +
                ",\n\t" + "phones=" + phones +
                ",\n\t" + "properties=" + properties +
                '\n' + '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<Integer, String> getPhones() {
        return phones;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
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
