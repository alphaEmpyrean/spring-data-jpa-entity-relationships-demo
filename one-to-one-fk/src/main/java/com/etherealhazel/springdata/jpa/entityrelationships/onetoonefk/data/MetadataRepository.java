package com.etherealhazel.springdata.jpa.entityrelationships.onetoonefk.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonefk.model.Metadata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "metadata", collectionResourceRel = "metadata")
public interface MetadataRepository extends JpaRepository<Metadata, UUID>{
    
}
