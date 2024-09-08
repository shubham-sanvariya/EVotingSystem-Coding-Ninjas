package com.codingninjas.EVotingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;

public interface ElectionChoiceRepository extends JpaRepository<ElectionChoice,Long>{
    
    // @Query("SELECT ec FROM ElectionChoice ec JOIN ec.election el WHERE el.name = :electionName")
    // List<ElectionChoice> findElectionChoicesByElection(String electionName);
    @Query("Select count(ec) From ElectionChoice ec where ec.election = :election")
	long countByElection(@Param("election") Election election);
}
