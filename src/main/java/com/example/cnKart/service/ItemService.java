package com.example.cnKart.service;

import com.example.cnKart.dal.ItemRepository;
import com.example.cnKart.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Transactional
    public void updateItem(Item updateitem) {

    }

    @Transactional
    public Item getItemById(int id) {
        return itemRepository.findById(id).get();
    }

    @Transactional
    public void addItem(Item item) {

    }
    @Transactional
    public void deleteById(int id) {

    }
}
