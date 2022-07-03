package com.nag.system.poc.controller;

import com.nag.system.poc.domain.user;
import com.nag.system.poc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;



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
    public void updateUser(@RequestBody user usr){
        userService.updateUser(usr);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody user usr){
        userService.deleteUser(usr);
        return "Deleted Successfully";
    }
}
