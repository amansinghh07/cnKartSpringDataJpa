package com.example.cnKart.dal;

import com.example.cnKart.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Integer> {
}
