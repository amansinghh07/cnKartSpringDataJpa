package com.example.cnKart.service;

import com.example.cnKart.dal.ItemDetailsDalImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDetailsService {
    @Autowired
    ItemDetailsDalImpl itemDetailsDal;
    @Transactional
    public void deleteItemDetails(int id) {
        itemDetailsDal.deleteDetailsById(id);
    }
}
