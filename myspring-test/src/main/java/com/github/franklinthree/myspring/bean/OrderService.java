package com.github.franklinthree.myspring.bean;

public class OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generateOrder(){
        orderDao.insert();
        System.out.println("OrderService.generateOrder()");
    }
}
