package com.example.cnKart.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
public class  ItemDetails {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String brand;
    @Column
    private double price;
    @Column
    private String category;
    @OneToOne (mappedBy = "itemDetails",cascade = CascadeType.ALL)

    private Item item;

}
