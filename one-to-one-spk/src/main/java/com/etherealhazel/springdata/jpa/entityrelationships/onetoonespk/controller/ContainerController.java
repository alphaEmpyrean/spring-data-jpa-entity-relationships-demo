package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.controller;

import java.util.List;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.data.ContainerRepository;
import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.data.MetadataRepository;
import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model.Container;
import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model.Metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/containers")
public class ContainerController {

    
    private final ContainerRepository containerRepository;
    private final MetadataRepository metadataRepository;

    @Autowired
    public ContainerController(ContainerRepository containerRepository, MetadataRepository metadataRepository) {
        this.containerRepository = containerRepository;
        this.metadataRepository = metadataRepository;
    }

    @PostMapping
    public void createContainer(@RequestBody Container container) {
        Metadata metadata = new Metadata(container);
        metadataRepository.save(metadata);
        container.setMetadata(metadata);
        containerRepository.save(container);
    }

    @GetMapping
    public List<Container> getAllContainers() {
        return containerRepository.findAll();
    }
    
}
