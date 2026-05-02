package com.example.cachingdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders") // "order" is reserved word, so we use "orders"
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String productName;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    // getters and setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}