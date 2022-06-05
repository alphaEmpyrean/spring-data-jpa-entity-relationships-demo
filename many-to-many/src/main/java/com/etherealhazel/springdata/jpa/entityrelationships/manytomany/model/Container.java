package com.etherealhazel.springdata.jpa.entityrelationships.manytomany.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Container {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONTAINER_ID", columnDefinition = "uuid")
    private UUID conttainerId;

    @Column(name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "containers")
    private List<AppUser> users;

    public UUID getConttainerId() {
        return conttainerId;
    }

    public void setConttainerId(UUID conttainerId) {
        this.conttainerId = conttainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppUser> getUsers() {
        return users;
    }

    public void setUsers(List<AppUser> users) {
        this.users = users;
    }    

}
