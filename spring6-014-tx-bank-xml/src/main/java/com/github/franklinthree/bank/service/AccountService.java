package com.github.franklinthree.bank.service;

import com.github.franklinthree.bank.pojo.Account;

/**
 * 帐户服务
 * 事务就是在这个接口下控制的。
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountService
 * @see
 * @since 1.0.0
 */
//@Service
public interface AccountService {
    /**
     * 转账
     *
     * @param outActno 转出账户
     * @param inActno  转入账户
     * @param money    转账金额
     */
    void transfer(String outActno, String inActno, Double money);

}
