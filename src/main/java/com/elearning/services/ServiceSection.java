package com.elearning.services;

import org.springframework.stereotype.Service;

import com.elearning.models.Section;
import com.elearning.repositories.SectionRepository;

@Service
public class ServiceSection {
     private final SectionRepository sectionRepository;

    public ServiceSection(SectionRepository sectionRepository){
        this.sectionRepository = sectionRepository;
    }
        public Section createSection(Section section) {
        return this.sectionRepository.save(section);
    }

}
