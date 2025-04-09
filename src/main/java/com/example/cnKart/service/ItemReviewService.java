package com.example.cnKart.service;

import com.example.cnKart.entity.ItemReview;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {
    @Autowired
    ItemReviewDal itemReviewDal;
    @Transactional
    public void addItemReview(ItemReview itemReview) {
        itemReviewDal.addItemReview(itemReview);
    }
}
