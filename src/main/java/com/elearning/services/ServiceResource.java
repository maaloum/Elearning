package com.elearning.services;

import org.springframework.stereotype.Service;

import com.elearning.models.Resource;
import com.elearning.repositories.ResourceRepository;

@Service
public class ServiceResource {

    private final ResourceRepository resourceRepository;

    public ServiceResource(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;}

    public Resource createResource(Resource resource) {
        return this.resourceRepository.save(resource);
    }
}
