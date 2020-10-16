package com.skmdemo.mapstruct.service;


import com.skmdemo.mapstruct.domain.dto.UserDto;
import com.skmdemo.mapstruct.domain.entity.Order;
import com.skmdemo.mapstruct.domain.entity.User;
import com.skmdemo.mapstruct.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public UserDto get() {
        return mapper.toDto(createUser());
    }

    private User createUser() {
        User user = new User(1, "David", "Minsk");
        user.setOrders(createOrders());
        return user;
    }

    private List<Order> createOrders() {
        return Arrays.asList(
                new Order(1), new Order(2)
        );
    }
}
