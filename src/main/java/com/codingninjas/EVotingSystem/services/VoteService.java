package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;

@Service
public class VoteService {
    
    @Autowired
    VoteRepository voteRepository;

    public void addVote(Vote vote){
        if (vote == null) {
            throw new IllegalArgumentException("Vote cannot be null");
        }
        if (vote.getUser() == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        if (vote.getElection() == null) {
            throw new IllegalArgumentException("Election cannot be null");
        }
        if (vote.getElectionChoice() == null) {
            throw new IllegalArgumentException("Election choice cannot be null");
        }

        // Save the vote to the database
        voteRepository.save(vote);
    }

    public List<Vote> getAllVotes(){
        return voteRepository.findAll();
    }
}
