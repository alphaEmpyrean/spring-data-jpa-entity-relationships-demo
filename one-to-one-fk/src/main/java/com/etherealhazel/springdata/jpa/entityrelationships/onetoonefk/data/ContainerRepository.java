package com.etherealhazel.springdata.jpa.entityrelationships.onetoonefk.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonefk.model.Container;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContainerRepository extends JpaRepository<Container, UUID>{

    
}
