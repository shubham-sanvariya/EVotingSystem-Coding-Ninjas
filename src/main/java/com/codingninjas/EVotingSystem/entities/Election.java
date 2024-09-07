package com.codingninjas.EVotingSystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Election {
    
    private Long id;

    @Column(unique = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
