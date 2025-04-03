package com.example.cnKart.controller;

import com.example.cnKart.entity.Item;
import com.example.cnKart.entity.Order;
import com.example.cnKart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
    @PostMapping("/add")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrderById(@PathVariable int id){
        orderService.deleteOrderById(id);
        return "Order has been deleted for id:"+id;
    }
}
