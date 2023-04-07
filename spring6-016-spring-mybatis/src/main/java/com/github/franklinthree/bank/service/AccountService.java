package com.github.franklinthree.bank.service;

import com.github.franklinthree.bank.pojo.Account;

import java.util.List;

/**
 * 帐户服务
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className AccountService
 * @see
 * @since 1.0.0
 */
public interface AccountService {


    /**
     * 开户
     *
     * @param account 账户
     * @return int
     */
    int save(Account account);

    /**
     * 按actno销户
     *
     * @param actno actno
     * @return int
     */
    int removeByActno(String actno);

    /**
     * 修改账户
     *
     * @param account 账户
     * @return int
     */
    int modify(Account account);

    /**
     * 按actno查询账户
     *
     * @param actno actno
     * @return {@link Account }
     */
    Account getByActno(String actno);

    /**
     * 查询所有账户
     *
     * @return {@link List }<{@link Account }>
     */
    List<Account> getAll();

    /**
     * 转账
     *
     * @param outActno 转出账户
     * @param inActno  转入账户
     * @param money    金额
     */
    void transfer(String outActno, String inActno, Double money);
}
