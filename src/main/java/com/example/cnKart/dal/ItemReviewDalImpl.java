package com.example.cnKart.dal;

import com.example.cnKart.entity.ItemReview;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemReviewDalImpl implements ItemReviewDal {
    @Autowired
    EntityManager entityManager;
    @Override
    public void addItemReview(ItemReview itemReview) {
        Session session=entityManager.unwrap(Session.class);
        session.save(itemReview);
    }
}
