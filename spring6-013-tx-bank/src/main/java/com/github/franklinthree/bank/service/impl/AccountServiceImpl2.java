package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import com.github.franklinthree.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 帐户服务impl2
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountServiceImpl2
 * @see @see AccountService
 * @since 1.0.0
 */
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService{

    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void transfer(String outActno, String inActno, Double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account account) {
        int e = 1 / 0;
        accountDao.insert(account);
    }
}
