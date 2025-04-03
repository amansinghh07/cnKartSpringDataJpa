package com.example.cnKart.service;

import com.example.cnKart.dal.ItemDAL;
import com.example.cnKart.dal.ItemDalImpl;
import com.example.cnKart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    ItemDAL itemDal;

    @Transactional
    public void updateItem(Item updateitem) {
        itemDal.updateItem(updateitem);
    }

    @Transactional
    public Item getItemById(int id) {
        return itemDal.getById(id);
    }

    @Transactional
    public void addItem(Item item) {
        itemDal.addItem(item);
    }
    @Transactional
    public void deleteById(int id) {
        itemDal.deleteById(id);
    }
}
