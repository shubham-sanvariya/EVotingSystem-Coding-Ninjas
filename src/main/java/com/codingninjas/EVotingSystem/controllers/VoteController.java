package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.services.VoteService;

@RestController
public class VoteController {
    
    @Autowired
    VoteService voteService;

    @PostMapping("/add/vote")
    public void addVote(@RequestBody Vote vote){
        voteService.addVote(vote);
    }

    @GetMapping("/get/votes")
    public List<Vote> getAllVotes(){
        return voteService.getAllVotes();
    }

    @GetMapping("/count/votes")
    public Long getTotalVotes(){
        return voteService.getTotalVotes();
    }

    @PostMapping("/count/election/votes")
    public Long getVoteCountForElection(@RequestBody Election election){
        return voteService.getVoteCountForElection(election);
    }

    @PostMapping("/winner/election")
    public ElectionChoice getElectionWinner(@RequestBody Election election){
        return voteService.getWinnerOfElection(election);
    }
}
