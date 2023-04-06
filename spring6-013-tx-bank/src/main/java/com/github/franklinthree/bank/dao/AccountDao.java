package com.github.franklinthree.bank.dao;

import com.github.franklinthree.bank.pojo.Account;

/**
 * 账户Dao
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountDao
 * @see
 * @since 1.0.0
 */
public interface AccountDao {
    /**
     * 根据账号查询账户信息
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新
     *
     * @param account 账户
     * @return int
     */
    int update(Account account);
}
