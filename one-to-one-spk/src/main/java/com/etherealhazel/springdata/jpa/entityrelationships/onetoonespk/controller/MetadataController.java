package com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.controller;

import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.data.MetadataRepository;
import com.etherealhazel.springdata.jpa.entityrelationships.onetoonespk.model.Metadata;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/metadata")
public class MetadataController {

    private final MetadataRepository metadataRepository;
    
    public MetadataController(MetadataRepository metadataRepository) {
        this.metadataRepository = metadataRepository;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Metadata> createMetadata(@RequestBody Metadata metadata) {
        metadataRepository.save(metadata);
        return null;

    }

}
