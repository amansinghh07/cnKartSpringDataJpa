package com.example.cnKart.controller;

import com.example.cnKart.entity.Item;
import com.example.cnKart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("id/{id}")
  public Item getItemById(@PathVariable int id){
       return itemService.getItemById(id);
    }
    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteItemById(@PathVariable int id){
        itemService.deleteById(id);
    }
    @PutMapping("/update")
    public void setUpdateitem(@RequestBody Item updateitem){
        itemService.updateItem(updateitem);
    }
}
