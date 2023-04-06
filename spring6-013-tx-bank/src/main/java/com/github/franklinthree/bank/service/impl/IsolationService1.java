package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 负责查询
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className IsolationService1
 * @see
 * @since 1.0.0
 */

@Service("i1")
public class IsolationService1 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void getByActno(String actno){
        Account account = accountDao.selectByActno(actno);
        System.out.println("查询到的账户信息：\n" + account);
    }
}
