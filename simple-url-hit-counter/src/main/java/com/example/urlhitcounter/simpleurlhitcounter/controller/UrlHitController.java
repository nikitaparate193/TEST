package com.example.urlhitcounter.simpleurlhitcounter.controller;

import com.example.urlhitcounter.simpleurlhitcounter.model.User;
import com.example.urlhitcounter.simpleurlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService;

    @GetMapping("count")
    public int getHitCount(){
        return urlHitService.getHitCount();
    }
    @PostMapping("users/{userName}")
    public String addUser(@PathVariable String userName){
        return urlHitService.addUser(userName);
    }
}
