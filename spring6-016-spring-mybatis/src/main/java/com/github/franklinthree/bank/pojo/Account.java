package com.github.franklinthree.bank.pojo;

/**
 * 账户
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className Account
 * @see
 * @since 1.0.0
 */
public class Account {
    private String actno;
    private Double balance;

    public Account(){
    }

    public Account(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "\n\t" + "actno='" + actno + '\'' +
                ",\n\t" + "balance=" + balance +
                '\n' + '}';
    }

}
