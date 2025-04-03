package com.example.cnKart.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="item_review")
public class ItemReview {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String reviewerName;
    @Column
    private String review;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    @JsonBackReference
    private Item item;
}
