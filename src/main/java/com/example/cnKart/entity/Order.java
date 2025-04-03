package com.example.cnKart.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "Order_Table")
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String orderType;
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name="order_Item",joinColumns = @JoinColumn(name = "order_Id"),
    inverseJoinColumns = @JoinColumn(name="item_id"))
    private List<Item> items;
}
