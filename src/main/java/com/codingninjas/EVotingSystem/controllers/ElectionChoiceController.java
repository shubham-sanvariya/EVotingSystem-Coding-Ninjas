package com.codingninjas.EVotingSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.services.ElectionChoiceService;

@RestController
public class ElectionChoiceController {
    
    @Autowired
    ElectionChoiceService service;

    @PostMapping("/add/electionChoice")
    public void addElectionChoice(@RequestBody ElectionChoice electionChoice){
        service.addElectionChoice(electionChoice);
    }
}
