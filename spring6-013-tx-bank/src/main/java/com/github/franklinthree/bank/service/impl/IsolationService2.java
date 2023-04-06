package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 负责插入
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className IsolationService2
 * @see
 * @since 1.0.0
 */
@Service("i2")
public class IsolationService2 {

    @Resource
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void save(Account account){
        accountDao.insert(account);
        System.out.println("插入成功");
        // 睡眠一会
        try {
            Thread.sleep(1000 * 30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
