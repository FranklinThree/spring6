package com.github.franklinthree.service;

import com.github.franklinthree.dao.OrderDao;

/**
 * 订单服务
 *
 * @author $AUTHER$
 * @date 2023/02/19
 * @className OrderService
 * @see
 * @since 1.0.0
 */
public class OrderService {
    private OrderDao orderDao;

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * 生成订单的业务方法
     */
    public void generate(){
        orderDao.insert();
    }
}
