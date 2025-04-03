package com.example.cnKart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Data
@Entity
@Table (name = "Item")
public class Item {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemDetails itemDetails;
    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    //-what it will do it will got to item review and add the column item_id in the item review table
    @JsonManagedReference
    private List<ItemReview> itemReviewList;
    @ManyToMany (mappedBy = "items")
    @JsonIgnore
    private List<Order>orders;
}
