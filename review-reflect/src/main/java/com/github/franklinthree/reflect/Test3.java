package com.github.franklinthree.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.github.franklinthree.reflect.SomeService");
        Method doSomeMethod = aClass.getDeclaredMethod("doSome");

        Constructor<?> con = aClass.getDeclaredConstructor();
        Object obj = con.newInstance();

        doSomeMethod.invoke(obj);

    }
}
