package com.codingninjas.EVotingSystem.services;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;

@Service
public class ElectionChoiceService {
    
    @Autowired
    ElectionChoiceRepository repository;

    @Autowired
    ElectionRepository electionRepository;

    public void addElectionChoice(ElectionChoice electionChoice){
        repository.save(electionChoice);
    }

    public List<ElectionChoice> getAllElectionChoices(){
        return repository.findAll();
    }

    public List<ElectionChoice> getElectionChoicesByElection(Election election){
        Election el = electionRepository.findById(election.getId())
            .orElseThrow(() -> new NoSuchElementException("election id not found:"));
            
        return repository.findElectionChoicesByElection(el.getName());
    }
}
