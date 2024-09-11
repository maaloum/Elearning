package com.elearning.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elearning.models.Course;
import com.elearning.repositories.CouseRepository;

@Service
public class ServiceCourse {
    
    private final CouseRepository courseRepository;

    public ServiceCourse(CouseRepository courseRepository) {
        this.courseRepository = courseRepository;}

    
    public List<Course> getAllCourses(){
        return this.courseRepository.findAll();
    }

}
