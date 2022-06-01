package com.etherealhazel.springdata.jpa.entityrelationships.onetoonejt.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONTAINER_ID", columnDefinition = "uuid")
    private UUID containerId;

    @Column(name = "NAME")
    private String name;

    @OneToOne
    @JoinTable(name = "CONTAINER_METADATA", 
        joinColumns = {@JoinColumn(name = "CONTAINER_ID")}, 
        inverseJoinColumns = {@JoinColumn(name = "METADATA_ID")})
    private Metadata metadata;

    public UUID getContainerId() {
        return containerId;
    }

    public void setContainerId(UUID containerId) {
        this.containerId = containerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    
}
