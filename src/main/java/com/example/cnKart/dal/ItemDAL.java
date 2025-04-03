package com.example.cnKart.dal;

import com.example.cnKart.entity.Item;

public interface ItemDAL {
    Item getById(int id);

    void addItem(Item item);

    void deleteById(int id);

    void updateItem(Item updateitem);
}
