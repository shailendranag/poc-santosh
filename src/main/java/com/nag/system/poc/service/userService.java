package com.nag.system.poc.service;

import com.nag.system.poc.domain.user;
import com.nag.system.poc.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository userRepository;

    public List<user> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(user usr){
        userRepository.save(usr);
    }

    public void deleteUser(user usr){
        userRepository.delete(usr);
    }
}
