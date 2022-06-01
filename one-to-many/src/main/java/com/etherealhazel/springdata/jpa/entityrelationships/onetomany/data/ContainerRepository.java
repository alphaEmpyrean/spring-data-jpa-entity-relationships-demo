package com.etherealhazel.springdata.jpa.entityrelationships.onetomany.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetomany.model.Container;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContainerRepository extends JpaRepository<Container, UUID>{
    
}
