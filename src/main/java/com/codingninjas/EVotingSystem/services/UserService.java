package com.codingninjas.EVotingSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.User;
import com.codingninjas.EVotingSystem.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }
}
