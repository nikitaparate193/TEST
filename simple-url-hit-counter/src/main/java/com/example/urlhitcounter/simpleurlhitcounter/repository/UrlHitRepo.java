package com.example.urlhitcounter.simpleurlhitcounter.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UrlHitRepo {
    @Autowired
    private List<String> users;



        public List<String> getAllUsers() {
            return users;
        }

        public void add(String user) {
            users.add(user);
        }



}
