package com.vaksetu.vaksetu.controller;

import com.vaksetu.vaksetu.model.User;
import com.vaksetu.vaksetu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.registorUser(user);
    }

}
