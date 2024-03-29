package com.github.franklinthree.bank.pojo;

import org.springframework.stereotype.Component;

/**
 * 账户
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className Account
 * @see
 * @since 1.0.0
 */
@Component
public class Account {
    private String actno;
    private Double balance;

    public Account() {
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

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
