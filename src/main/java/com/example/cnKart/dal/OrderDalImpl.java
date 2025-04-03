package com.example.cnKart.dal;

import com.example.cnKart.entity.Order;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDalImpl implements OrderDal {
    @Autowired
    EntityManager entityManager;
    @Autowired
    ItemDAL itemDAL;

    @Override
    public Order getOrderById(int id) {
        Session session=entityManager.unwrap(Session.class);
        Order order=session.get(Order.class,id);
        return order;
    }

    @Override
    public void addOrder(Order saveOrder) {
    Session session=entityManager.unwrap(Session.class);
    session.save(saveOrder);
    }

    @Override
    public void deleteOrder(int id) {
    Session session=entityManager.unwrap(Session.class);
        Order order = getOrderById(id);
        session.delete(order);

    }
}
