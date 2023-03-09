package com.github.franklinthree.bean;

/**
 * 数学
 *
 * @author FranklinThree
 * @date 2023/03/10
 * @className Math
 * @see
 * @since 1.0.0
 */
public class Math {
    private String result;

    @Override
    public String toString() {
        return "Math{" +
                "\n\t" + "result='" + result + '\'' +
                '\n' + '}';
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
