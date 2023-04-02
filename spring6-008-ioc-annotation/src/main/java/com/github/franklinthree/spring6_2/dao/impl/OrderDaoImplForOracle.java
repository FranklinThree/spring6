package com.github.franklinthree.spring6_2.dao.impl;

import com.github.franklinthree.spring6_2.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImplForOracle implements OrderDao {

    @Override
    public void insert() {
        System.out.println("OrderDaoImplForOracle.insert");
    }
}
