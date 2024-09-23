package com.elearning.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elearning.models.Section;
import com.elearning.repositories.CouseRepository;
import com.elearning.repositories.SectionRepository;


@Service
public class ServiceSection {
     private final SectionRepository sectionRepository;
     private  CouseRepository couseRepository;

    public ServiceSection(SectionRepository sectionRepository, CouseRepository courseRepository){
        this.sectionRepository = sectionRepository;
        this.couseRepository = courseRepository;
    }
    // public Section createSection(Section section) {
    //     Course course = section.getCourse();
    //     System.out.println("course" + course);
    //     if (course != null) {
    //         Course fetchedCourse = couseRepository.findById(course.getCourseId())
    //             .orElseThrow(() -> new RuntimeException("Course not found"));
    //         section.setCourse(fetchedCourse);
    //     }
    //     return sectionRepository.save(section);
    // }


    public List<Section> getAllSections(){
        return this.sectionRepository.findAll();
    }

    public void deleteAllSections(){
        this.sectionRepository.deleteAll();
    }

}
