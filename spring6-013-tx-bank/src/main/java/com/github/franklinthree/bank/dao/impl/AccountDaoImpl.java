package com.github.franklinthree.bank.dao.impl;

import com.github.franklinthree.bank.dao.AccountDao;
import com.github.franklinthree.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public Account selectByActno(String actno) {
        String sql = "select actno, balance from t_act where actno = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), actno);
    }

    @Override
    public int update(Account account) {
        String sql = "update t_act set balance = ? where actno = ?";
        return jdbcTemplate.update(sql, account.getBalance(), account.getActno());
    }

    @Override
    public int insert(Account account) {
        String sql = "insert into t_act(actno, balance) values(?, ?)";
        return jdbcTemplate.update(sql, account.getActno(), account.getBalance());
    }
}
