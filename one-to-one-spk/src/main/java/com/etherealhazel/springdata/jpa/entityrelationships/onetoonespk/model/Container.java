package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINERS")
public class Container {
       
    public Container() {
    }

    public Container(String name, Metadata metadata) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CONTAINER_ID", columnDefinition = "uuid")
    private UUID containerId;

    @Column(name = "NAME")
    private String name;
    
    @OneToOne(mappedBy = "container")
    @PrimaryKeyJoinColumn
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
