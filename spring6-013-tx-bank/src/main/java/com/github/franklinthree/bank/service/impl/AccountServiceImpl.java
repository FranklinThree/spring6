package com.github.franklinthree.bank.service.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import com.github.franklinthree.bank.service.AccountService;
import jakarta.annotation.Resource;

/**
 * 账户服务实现
 *
 * @author FranklinThree
 * @date 2023/04/06
 * @className AccountServiceImpl
 * @see
 * @since 1.0.0
 */
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    /**
     * 转账
     * 控制事务，因为在这个方法中要完成所有的转账业务
     *
     * @param outActno 出actno
     * @param inActno  在actno
     * @param money    钱
     */
    @Override
    public void transfer(String outActno, String inActno, Double money) {
        if (money <= 0){
            throw new RuntimeException("转账金额必须大于0");
        }
        Account outAccount = accountDao.selectByActno(outActno);
        // 查询转出账户的余额是否充足
        if (outAccount.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        Account inAccount = accountDao.selectByActno(inActno);
        // 转出账户减钱
        outAccount.setBalance(outAccount.getBalance() - money);
        inAccount.setBalance(inAccount.getBalance() + money);

        // 更新数据库
        int outCount = accountDao.update(outAccount);
        int inCount = accountDao.update(inAccount);
        if (outCount != 1 || inCount != 1) {
            throw new RuntimeException("转账失败，联系管理员");
        }

    }
}
