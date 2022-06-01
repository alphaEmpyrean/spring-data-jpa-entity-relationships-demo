package com.etherealhazel.springdata.jpa.entityrelationships.onetoonejt.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonejt.model.Metadata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MetadataRepository extends JpaRepository<Metadata, UUID>{
    
}
