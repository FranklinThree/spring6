package com.github.franklinthree.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * vip刀
 *
 * @author FranklinThree
 * @date 2023/02/19
 */
public class VipDao {
    public static final Logger logger = LoggerFactory.getLogger(VipDao.class);
    public void insert(){
        logger.info("数据库正在保存Vip用户信息。");
    }
}
