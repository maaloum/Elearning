package com.elearning.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elearning.models.Author;
import com.elearning.models.Course;
import com.elearning.repositories.AuthorRespository;
import com.elearning.repositories.CouseRepository;

import jakarta.transaction.Transactional;

@Service
public class ServiceCourse {
    
    private final CouseRepository courseRepository;
    private final AuthorRespository authorRespository;

    public ServiceCourse(CouseRepository courseRepository, AuthorRespository authorRespository) {
        this.courseRepository = courseRepository;
        this.authorRespository = authorRespository;
    }

    @Transactional
    public List<Course> getAllCourses(){
        return this.courseRepository.findAll();
    }

    // create a new course 
    public Course creatCourse(Course course){
        return this.courseRepository.save(course);
    }
@Transactional
    public Course assignAuthorToCourse(Long courseId, Long authorId){
        Course courseToAssign = this.courseRepository.findById(courseId).
        orElseThrow(() -> new RuntimeException("Course not found with id: " + courseId));
        Author author = this.authorRespository.findById(authorId).orElseThrow(() -> new RuntimeException("Author not found with id: " + authorId));
        courseToAssign.getAuthors().add(author);
        return this.courseRepository.save(courseToAssign);

    }

    @Transactional
    public List<Author> getAuthorsByCourseId(Long courseId){
        Course course =  this.courseRepository.findById(courseId).
        orElseThrow(() -> new RuntimeException("Course not found with" + courseId));
        System.out.println("courses authors" + course.getAuthors());
        return new ArrayList<>(course.getAuthors()); 
    }

   public void deleteAuthorFromCourse(Long courseId){
        Course course = this.courseRepository.findById(courseId).
        orElseThrow(() -> new RuntimeException("Course not found with" + courseId));
        course.getAuthors().clear();
        this.courseRepository.save(course);
        }
    
}
