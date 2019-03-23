package com.veinhorn.mapstruct.controller;

import com.veinhorn.mapstruct.domain.dto.UserDto;
import com.veinhorn.mapstruct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public UserDto get() {
        return userService.get();
    }
}
