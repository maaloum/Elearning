package com.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.models.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    
}
