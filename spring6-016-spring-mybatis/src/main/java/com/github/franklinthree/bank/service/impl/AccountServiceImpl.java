package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.mapper.AccountMapper;
import com.github.franklinthree.bank.pojo.Account;
import com.github.franklinthree.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * impl账户服务
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className AccountServiceImpl
 * @see
 * @since 1.0.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;
    @Override
    public int save(Account account) {
        return accountMapper.insert(account);

    }

    @Override
    public int removeByActno(String actno) {
        return accountMapper.deleteByActno(actno);
    }

    @Override
    public int modify(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String outActno, String inActno, Double money) {
        Account outAct = accountMapper.selectByActno(outActno);
        Account inAct = accountMapper.selectByActno(inActno);
        // 如果余额不足则抛出异常
        if (outAct.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        // 如果转出账户和转入账户相同则抛出异常
        if (outActno.equals(inActno)) {
            throw new RuntimeException("转出账户和转入账户相同");
        }
        // 转出账户减钱
        outAct.setBalance(outAct.getBalance() - money);
        int outCount = accountMapper.update(outAct);
        // 转入账户加钱
        inAct.setBalance(inAct.getBalance() + money);
        int inCount = accountMapper.update(inAct);

        // 如果转出或转入失败则抛出异常
        if (outCount != 1 || inCount != 1) {
            throw new RuntimeException("转账失败");
        }


    }
}
