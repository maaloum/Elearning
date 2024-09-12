package com.elearning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.elearning.models.*;
import com.elearning.services.ServiceCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;


@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private final ServiceCourse serviceCourse;

    public CourseController(ServiceCourse courseService){
        this.serviceCourse = courseService;
    }

    @GetMapping("")
    public List<Course> getAllCourses() {
        return this.serviceCourse.getAllCourses();
    }

    @PostMapping("")
    public Course createCourse(@RequestBody Course course){
        return this.serviceCourse.creatCourse(course);
    }
    
    @PostMapping("{courseId}/authors/{authorId}")
    public Course assignAuthorToCourse(@PathVariable Long courseId, @PathVariable Long authorId) {
        
        return this.serviceCourse.assignAuthorToCourse(courseId, authorId);
    }

    @GetMapping("/{courseId}/authors")
    public List<Author> getAuthorsByCourseId(@PathVariable Long courseId) {
        return this.serviceCourse.getAuthorsByCourseId(courseId);
    }
    
    @DeleteMapping("/{courseId}/authors")
    public void deleteAuthorFromCourse(@PathVariable Long courseId) {
        this.serviceCourse.deleteAuthorFromCourse(courseId);
    }
}
