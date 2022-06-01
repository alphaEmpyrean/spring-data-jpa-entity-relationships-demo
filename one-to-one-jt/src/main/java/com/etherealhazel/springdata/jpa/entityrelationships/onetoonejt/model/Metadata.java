package com.etherealhazel.springdata.jpa.entityrelationships.onetoonejt.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Metadata {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "METADATA_ID", columnDefinition = "uuid")
    private UUID metadataId;

    @Column(name = "DATA")
    private String data;

    @OneToOne(mappedBy = "metadata")
    private Container container;

    public UUID getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(UUID metadataId) {
        this.metadataId = metadataId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    

    
}
