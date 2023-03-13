package com.github.franklinthree.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 订单Dao
 *
 * @author $AUTHER$
 * @date 2023/02/19
 * @className OrderDao
 * @see
 * @since 1.0.0
 */
public class OrderDao {
    public static final Logger logger = LoggerFactory.getLogger(OrderDao.class);


    /**
     * 添加订单
     */
    public void insert(){
        logger.info("订单正在生成...");
    }
}

