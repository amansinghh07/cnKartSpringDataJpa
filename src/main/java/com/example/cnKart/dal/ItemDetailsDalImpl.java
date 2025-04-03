package com.example.cnKart.dal;

import com.example.cnKart.entity.Item;
import com.example.cnKart.entity.ItemDetails;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDetailsDalImpl implements ItemDetailsDal {
    @Autowired
    EntityManager entityManager;
    @Override
    public void deleteDetailsById(int id) {
        Session session=entityManager.unwrap(Session.class);
        ItemDetails itemDetails=session.get(ItemDetails.class,id);
        session.delete(itemDetails);

    }
}
