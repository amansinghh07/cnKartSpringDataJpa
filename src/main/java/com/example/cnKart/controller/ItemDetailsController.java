package com.example.cnKart.controller;

import com.example.cnKart.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class ItemDetailsController {
    @Autowired
    ItemDetailsService itemDetailsService;
    @DeleteMapping("/delete/{id}")
    public void deleteItemDetails(@PathVariable int id){
        itemDetailsService.deleteItemDetails(id);
    }

}
