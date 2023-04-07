package com.github.franklinthree.bank.mapper;

import com.github.franklinthree.bank.pojo.Account;

import java.util.List;

/**
 * 账户映射器
 *
 * @author FranklinThree
 * @date 2023/04/07
 * @className AccountMapper
 * @see
 * @since 1.0.0
 */
public interface AccountMapper {    // 该接口的实现类不需要写，是mybatis通过动态代理机制生成的实现类。

    // 这就是DAO。只要编写CRUD方法即可。

    /**
     * 插入账户
     *
     * @param account 账户
     * @return int
     */
    int insert(Account account);

    /**
     * 按actno删除账户
     *
     * @param actno actno
     * @return int
     */
    int deleteByActno(String actno);

    /**
     * 更新账户
     *
     * @param account 账户
     * @return int
     */
    int update(Account account);

    /**
     * 按actno查询账户
     *
     * @param actno actno
     * @return {@link Account }
     */
    Account selectByActno(String actno);

    /**
     * 查询所有账户
     *
     * @return {@link List }<{@link Account }>
     */
    List<Account> selectAll();
}
