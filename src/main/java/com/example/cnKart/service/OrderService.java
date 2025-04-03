package com.example.cnKart.service;

import com.example.cnKart.dal.ItemDAL;
import com.example.cnKart.dal.OrderDal;
import com.example.cnKart.entity.Item;
import com.example.cnKart.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderDal orderDal;
    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Order getOrderById(int id) {
        return orderDal.getOrderById(id);
    }

    @Transactional
    public void addOrder(Order order) {
        Order saveorder=new Order();
        saveorder.setOrderType(order.getOrderType());
        List<Item> itemList=new ArrayList<>();
        for (Item item: order.getItems()){
            Item currentItems = itemDAL.getById(item.getId());
            itemList.add(currentItems);
        }
        saveorder.setItems(itemList);
        orderDal.addOrder(saveorder);
    }

    @Transactional
    public void deleteOrderById(int id) {
        orderDal.deleteOrder(id);
    }
}
