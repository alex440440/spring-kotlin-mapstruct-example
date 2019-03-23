package com.veinhorn.mapstruct.domain.dto;

import com.veinhorn.mapstruct.domain.entity.Order;

import java.util.List;

public class UserDto {
    private int id;
    private List<Order> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
