package com.github.franklinthree.bean;

import org.springframework.util.ClassUtils;

import java.net.URI;
import java.net.URL;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;

/**
 * 测试简单类型
 *
 * @author FranklinThree
 * @date 2023/02/27
 * @className SimpleValueType
 * @see
 * @since 1.0.0
 */
public class SimpleValueType {
    public static void main(String[] args) {
        System.out.println(new Date());
    }
    public static boolean isSimpleValueType(Class<?> type) {
        return Void.class != type && Void.TYPE != type && (
                ClassUtils.isPrimitiveOrWrapper(type) ||
                        Enum.class.isAssignableFrom(type) ||
                        CharSequence.class.isAssignableFrom(type) ||
                        Number.class.isAssignableFrom(type) ||
                        Date.class.isAssignableFrom(type) ||
                        Temporal.class.isAssignableFrom(type) ||
                        URI.class == type ||
                        URL.class == type ||
                        Locale.class == type ||
                        Class.class == type);
    }
    private int age;
    private Integer age2;

    private boolean flag;
    private Boolean flag2;

    private char c;
    private Character c2;

    private Season season;

    private String username;

    private Class clazz;

    private Date birth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag2() {
        return flag2;
    }

    public void setFlag2(Boolean flag2) {
        this.flag2 = flag2;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Character getC2() {
        return c2;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    /**
     * 字符串
     *
     * @return {@link String }
     */
    @Override
    public String toString() {
        return "SimpleValueType{" +
                "\n\t" + "age=" + age +
                ",\n\t" + "age2=" + age2 +
                ",\n\t" + "flag=" + flag +
                ",\n\t" + "flag2=" + flag2 +
                ",\n\t" + "c=" + c +
                ",\n\t" + "c2=" + c2 +
                ",\n\t" + "season=" + season +
                ",\n\t" + "username='" + username + '\'' +
                ",\n\t" + "clazz=" + clazz +
                ",\n\t" + "birth=" + birth +
                '\n' + '}';
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
