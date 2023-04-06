package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

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

//    @Transactional(isolation = Isolation.REPEATABLE_READ, rollbackFor = RuntimeException.class) // 只要发生RuntimeException异常，就回滚
    @Transactional(noRollbackFor = NullPointerException.class) // 发生NullPointerException异常，不回滚
    public void save(Account account) throws IOException {
        accountDao.insert(account);

        // 模拟运行时异常
//        int e = 1 / 0;
        String s = null;
        s.toString();

        // 模拟IO异常
//        throw new IOException();



//        // 睡眠一会
//        try {
//            Thread.sleep(1000 * 20);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }


}
