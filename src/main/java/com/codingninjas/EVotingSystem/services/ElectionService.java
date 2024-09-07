package com.codingninjas.EVotingSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;

@Service
public class ElectionService {
    @Autowired
    ElectionRepository electionRepository;

    public void addElection(Election election){
        electionRepository.save(election);
    }
}
