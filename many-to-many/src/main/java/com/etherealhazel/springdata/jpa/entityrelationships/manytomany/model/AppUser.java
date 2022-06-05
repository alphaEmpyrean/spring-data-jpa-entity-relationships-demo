package com.etherealhazel.springdata.jpa.entityrelationships.manytomany.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class AppUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID", columnDefinition = "uuid")
    private UUID userId;

    @Column(name = "USERNAME")
    private String username;

    @ManyToMany()
    @JoinTable(name = "APP_USER_CONTAINER", 
        joinColumns = @JoinColumn(name = "CONTAINER_ID"), 
        inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private List<Container> containers;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
    
}
