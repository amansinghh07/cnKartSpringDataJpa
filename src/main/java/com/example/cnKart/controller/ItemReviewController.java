package com.example.cnKart.controller;

import com.example.cnKart.entity.ItemReview;
import com.example.cnKart.service.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ItemReviewController   {
    @Autowired
    ItemReviewService itemReviewService;
    @GetMapping("/get/{id}")
    public void getReviewById(@PathVariable int id){};
    @PostMapping("/save")
    public void addReview(@RequestBody ItemReview itemReview){
        itemReviewService.addItemReview(itemReview);
    }


}
