package com.elearning.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.elearning.models.Course;
import com.elearning.models.Section;
import com.elearning.repositories.SectionRepository;
import com.elearning.repositories.CouseRepository;


@Service
public class ServiceSection {
     private final SectionRepository sectionRepository;
     private  CouseRepository couseRepository;

    public ServiceSection(SectionRepository sectionRepository, CouseRepository courseRepository){
        this.sectionRepository = sectionRepository;
        this.couseRepository = courseRepository;
    }
    public Section createSection(Section section) {
        Course course = section.getCourse();
        System.out.println("course" + course);
        if (course != null) {
            Course fetchedCourse = couseRepository.findById(course.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));
            section.setCourse(fetchedCourse);
        }
        return sectionRepository.save(section);
    }


    public List<Section> getAllSections(){
        return this.sectionRepository.findAll();
    }


}
