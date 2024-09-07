package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
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

    @GetMapping("/get/electionChoices")
    public List<ElectionChoice> getAllElectionChoices(){
        return service.getAllElectionChoices();
    }

    @PostMapping("/count/election/choices")
    public List<ElectionChoice> getElectionChoicesByElection(@RequestBody Election election){
        return service.getElectionChoicesByElection(election);
    }
}
