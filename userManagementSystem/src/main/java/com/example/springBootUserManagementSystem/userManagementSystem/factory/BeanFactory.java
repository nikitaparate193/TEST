package com.example.springBootUserManagementSystem.userManagementSystem.factory;

import com.example.springBootUserManagementSystem.userManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getDataSource()
    {
        return new ArrayList<>();
    }
}
