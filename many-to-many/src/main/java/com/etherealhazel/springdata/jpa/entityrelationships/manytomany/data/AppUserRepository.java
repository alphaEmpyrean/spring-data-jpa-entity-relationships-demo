package com.etherealhazel.springdata.jpa.entityrelationships.manytomany.data;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.etherealhazel.springdata.jpa.entityrelationships.manytomany.model.AppUser;

@RepositoryRestResource
public interface AppUserRepository extends JpaRepository<AppUser, UUID>{
    
}
