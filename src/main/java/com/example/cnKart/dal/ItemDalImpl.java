package com.example.cnKart.dal;

import com.example.cnKart.entity.Item;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDalImpl implements ItemDAL {
    @Autowired
    EntityManager entityManager;
    @Override
    public Item getById(int id) {
     Session session=entityManager.unwrap(Session.class);
     return session.get(Item.class,id);
    }

    @Override
    public void addItem(Item item) {
        Session session=entityManager.unwrap(Session.class);
        session.persist(item);
    }

    @Override
    public void deleteById(int id) {
        Session session=entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        session.delete(item);
    }

    @Override
    public void updateItem(Item updateitem) {
        Session session=entityManager.unwrap(Session.class);
        Item item=session.get(Item.class,updateitem.getId());
        item.setName(updateitem.getName());
        item.setDescription(updateitem.getDescription());
        session.update(item);
    }
//    @Override
//    public Item getById(int id) {
//        Session session=entityManager.unwrap(Session.class);
//        return null;
//    }

}
