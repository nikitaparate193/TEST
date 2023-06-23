package com.example.urlhitcounter.simpleurlhitcounter.service;

import com.example.urlhitcounter.simpleurlhitcounter.repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo;
    private int hitCount=0;

    public int getHitCount(){
        return hitCount++;
    }
    public List<String> getAllUsers(){
        return urlHitRepo.getAllUsers();
    }

    public String addUser(String user) {
        urlHitRepo.add(user);
        return "User Added";
    }
}
