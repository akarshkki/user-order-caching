package com.example.cachingdemo.service;

import com.example.cachingdemo.entity.*;
import com.example.cachingdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private Map<Integer, User> cache = new HashMap<>();

    public User getUser(int id) {

        // Step 1: Check Cache
        if (cache.containsKey(id)) {
            System.out.println("Fetching from Cache...");
            return cache.get(id);
        }

        // Step 2: Fetch from DB
        System.out.println("Fetching from Database...");

        User user = userRepository.findById(id)
                .orElseGet(() -> createUser());

        // Step 3: Store in Cache
        cache.put(user.getId(), user);

        return user;
    }

    private User createUser() {

        User user = new User();
        user.setName("Akarsh");

        Order o1 = new Order();
        o1.setProductName("Mobile");
        o1.setUser(user);

        Order o2 = new Order();
        o2.setProductName("Laptop");
        o2.setUser(user);

        user.setOrders(Arrays.asList(o1, o2));

        return userRepository.save(user);
    }
}