package com.skmdemo.mapstruct.domain.entity;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String address;

    private List<Order> orders;


    public User(int id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
