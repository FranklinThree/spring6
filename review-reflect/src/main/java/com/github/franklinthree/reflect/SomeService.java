package com.github.franklinthree.reflect;

/**
 * 一些服务
 *
 * @author FranklinThree
 * @date 2023/03/29
 * @className SomeService
 * @see
 * @since 1.0.0
 */
public class SomeService {
    public void doSome(){
        System.out.println("public void doSome() -> 执行。");
    }

    public String doSome(String s){
        System.out.println("public void doSome(String s) -> 执行。");
        return s;
    }

    public String doSome(String s, int i){
        System.out.println("public String doSome(String s, int i) -> 执行。");
        return s+i;
    }
}
