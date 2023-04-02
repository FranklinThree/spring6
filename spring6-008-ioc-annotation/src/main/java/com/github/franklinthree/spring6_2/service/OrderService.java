package com.github.franklinthree.spring6_2.service;

import com.github.franklinthree.spring6_2.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 订单服务
 *
 * @author FranklinThree
 * @date 2023/04/03
 * @className OrderService
 * @see
 * @since 1.0.0
 */
@Service
public class OrderService {

    // @Autowired 注解使用的时候，不需要指定任何属性，直接使用这个注解即可。
    // 这个主角的作用是根据类型byType，从Spring容器中找到对应的bean，然后注入到当前的属性中。
//    @Autowired
//    private OrderDao orderDao;

    // 如果想解决上面的问题，可以使用@Qualifier注解，这个注解可以根据名称byName，从Spring容器中找到对应的bean，然后注入到当前的属性中。
    @Autowired
    @Qualifier("orderDaoImplForOracle")
    private OrderDao orderDao;

    public void generate(){
        orderDao.insert();
    }
}
