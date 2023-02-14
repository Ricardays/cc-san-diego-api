package com.zenithdev.ccsandiegoapi.controllers;

import com.zenithdev.ccsandiegoapi.models.Store;
import com.zenithdev.ccsandiegoapi.models.User;
import com.zenithdev.ccsandiegoapi.services.StoreService;
import com.zenithdev.ccsandiegoapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> listUser(){
        return userService.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/authenticate")
    public User authenticateUser(@RequestParam String username, @RequestParam String password){
        return userService.authenticate(username, password);
    }

    @GetMapping("/exists")
    public User authenticateUser(@RequestParam String username){
        return userService.exists(username);
    }
}
