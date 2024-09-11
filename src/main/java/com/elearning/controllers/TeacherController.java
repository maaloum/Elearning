package com.elearning.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TeacherController
{
    @GetMapping("/teachers")
    public String[] getAllTeacher(){
        String[] teachers = new String[] {"John Doe", "Jane Smith", "Mark Johnson"};
            return teachers;
    }

}
