package com.etherealhazel.springdata.jpa.entityrelationships.onetomany.data;

import java.util.UUID;

import com.etherealhazel.springdata.jpa.entityrelationships.onetomany.model.AppUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<AppUser, UUID>{
    
}
