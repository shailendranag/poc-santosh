package com.nag.system.poc.controller;

import com.nag.system.poc.domain.user;
import com.nag.system.poc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class userController {

    @Autowired
    private userService userService;

    @GetMapping("/info")
    public List<user> getUserInfo(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody user usr){
        userService.addUser(usr);
    }

    @PutMapping("/update")
    public String updateUser(){
        return "200 OK";
    }

    @DeleteMapping("/delete")
    public String deleteUser(){
        return "200 OK";
    }
}
