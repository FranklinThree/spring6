package com.github.franklinthree.spring6.bean;

/**
 * 用户
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className User
 * @see
 * @since 1.0.0
 */
public class User {
    private Integer id;
    private String realName;
    private Integer age;

    public User(Integer id, String realName, Integer age) {
        this.id = id;
        this.realName = realName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n\t" + "id=" + id +
                ",\n\t" + "realName='" + realName + '\'' +
                ",\n\t" + "age=" + age +
                '\n' + '}';
    }
}
