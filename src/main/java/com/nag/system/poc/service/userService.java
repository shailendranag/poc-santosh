package com.nag.system.poc.service;

import com.nag.system.poc.domain.user;
import com.nag.system.poc.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void updateUser(user usr){
        user user_modify = userRepository.findById(usr.getId()).get();
        user_modify.setEmail(usr.getEmail());
        user_modify.setFirstName(usr.getFirstName());
        user_modify.setLastName(usr.getLastName());
        user_modify.setEmail(usr.getEmail());
        user_modify.setPhoneNumber(usr.getPhoneNumber());

        userRepository.save(user_modify);
    }
}
