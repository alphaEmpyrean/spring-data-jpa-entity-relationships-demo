package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model.Container;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerRepository extends JpaRepository<Container, UUID>{

    
}
