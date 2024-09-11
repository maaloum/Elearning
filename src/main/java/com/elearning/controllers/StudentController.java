package com.elearning.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.models.Student;
import com.elearning.services.ServiceStudent;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final ServiceStudent serviceStudent;

    public StudentController(ServiceStudent serviceStudent){
        this.serviceStudent = serviceStudent;
    }

    @GetMapping("")
    public List<Student> getAllStudents(){
        return serviceStudent.getAllStudents();
    }

    @PostMapping("/create")
    public Student CreateStudent(@RequestBody Student student) {
        System.out.println(student);
        return this.serviceStudent.createStudent(student);
    }
    @GetMapping("/{studentId}")
    public Optional<Student> getStudentByID(@PathVariable Long studentId) {
        return this.serviceStudent.getStudentByID(studentId);
    }

    @PutMapping("/{studentId}")
    public Student updateStudent(@PathVariable Long studentId, @RequestBody Student student) {
        
        return this.serviceStudent.updateStudent(studentId, student);
    }
    
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
         this.serviceStudent.deleteStudent(studentId);
    }


    @DeleteMapping("")
    public void deleteAllStudents() {
        this.serviceStudent.deleteAllStudents();
        }
}
