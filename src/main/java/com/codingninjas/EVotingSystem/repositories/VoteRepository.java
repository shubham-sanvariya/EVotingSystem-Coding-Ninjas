package com.codingninjas.EVotingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.entities.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    Long countByElection(Election election);

    // @Query(value = "SELECT new com.codingninjas.EVotingSystem.entities.ElectionChoice(ec.id, ec.name, ec.election) " +
    //         "FROM Vote v JOIN ElectionChoice ec ON v.electionChoice.id = ec.id " +
    //         "WHERE v.election.id = :electionId " +
    //         "GROUP BY v.electionChoice.id " +
    //         "ORDER BY COUNT(v.id) DESC")
    // ElectionChoice findWinnerOfElection(@Param("electionId") Long electionId);
    @Query("SELECT v.electionChoice FROM Vote v WHERE v.election = :election " +
            "GROUP BY v.electionChoice " +
            "ORDER BY COUNT(v) DESC")
    ElectionChoice findWinnerOfElection(@Param("election") Election election);
}
