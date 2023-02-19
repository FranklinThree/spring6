package com.github.franklinthree.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {
    public static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        logger.info("数据库正在保存用户信息。");
    }
}
