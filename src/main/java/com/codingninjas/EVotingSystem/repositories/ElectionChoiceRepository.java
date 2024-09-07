package com.codingninjas.EVotingSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codingninjas.EVotingSystem.entities.ElectionChoice;

public interface ElectionChoiceRepository extends JpaRepository<ElectionChoice,Long>{
    
    @Query("SELECT ec FROM ElectionChoice ec JOIN ec.election el WHERE el.name = :electionName")
    List<ElectionChoice> findElectionChoicesByElection(String electionName);
}
