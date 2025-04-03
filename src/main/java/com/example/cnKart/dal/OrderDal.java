package com.example.cnKart.dal;

import com.example.cnKart.entity.Order;

public interface OrderDal {
    Order getOrderById(int id);

    void addOrder(Order order);

    void deleteOrder(int id);
}
