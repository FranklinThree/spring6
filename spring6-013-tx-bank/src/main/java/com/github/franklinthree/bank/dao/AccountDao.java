package com.github.franklinthree.bank.dao;

import com.github.franklinthree.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * 账户Dao
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountDao
 * @see
 * @since 1.0.0
 */
//@Repository
public interface AccountDao {
    /**
     * 根据账号查询账户信息
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 更新账户信息
     *
     * @param account 账户
     * @return int
     */
    int update(Account account);

    /**
     * 保存账户信息
     * @param account
     * @return
     */
    int insert(Account account);
}
