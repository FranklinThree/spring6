package com.github.franklinthree.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户刀
 *
 * @author FranklinThree
 * @date 2023/02/19
 */
public class UserDao {
    public static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        logger.info("数据库正在保存用户信息。");
    }
}
