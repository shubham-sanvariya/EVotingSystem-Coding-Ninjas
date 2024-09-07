package com.codingninjas.EVotingSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.services.ElectionService;

@RestController
public class ElectionController {

    @Autowired
    ElectionService electionService;
    
    @PostMapping("/add/election")
    public void addElection(@RequestBody Election election){
        electionService.addElection(election);
    }
}
