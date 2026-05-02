package com.example.cachingdemo;

import com.example.cachingdemo.entity.User;
import com.example.cachingdemo.entity.Order;
import com.example.cachingdemo.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class CachingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachingDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserService userService) {
        return args -> {

            User user1 = userService.getUser(1);
            printUser(user1);

            User user2 = userService.getUser(1);
            printUser(user2);
        };
    }

    public static void printUser(User user) {
        System.out.print(user.getName() + " ");

        for (Order order : user.getOrders()) {
            System.out.print(order.getProductName() + " ");
        }

        System.out.println();
    }
}