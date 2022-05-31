package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "METADATA")
public class Metadata {

    public Metadata() {
    }
    
    public Metadata(Container container) {
        this.container = container;
    }

    @Id
    @Column(name = "CONTAINER_ID", columnDefinition = "uuid")
    private UUID containerId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CONTAINER_ID")
    private Container container;

    public UUID getContainerId() {
        return containerId;
    }

    public void setContainerId(UUID metadataId) {
        this.containerId = metadataId;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    
}
