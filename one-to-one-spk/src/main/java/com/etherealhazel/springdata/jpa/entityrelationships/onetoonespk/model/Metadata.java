package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "METADATA")
public class Metadata {

    public Metadata() {
    }
    
    public Metadata(Container container) {
        this.container = container;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "METADATA_ID", columnDefinition = "uuid")
    private UUID metadataId;

    @OneToOne(mappedBy = "metadata")
    @RestResource(path = "metadata", rel = "metadata")
    private Container container;

    public UUID getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(UUID metadataId) {
        this.metadataId = metadataId;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    
}
