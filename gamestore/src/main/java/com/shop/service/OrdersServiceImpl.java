package com.shop.service;

import com.shop.entity.Orders;
import com.shop.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Владислав on 22.05.2017.
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public Orders save(Orders orders) {
        return ordersRepository.saveAndFlush(orders);
    }
}
