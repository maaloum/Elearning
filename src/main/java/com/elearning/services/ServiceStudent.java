package com.elearning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.elearning.models.Student;
import com.elearning.repositories.StudentRepository;

@Service
public class ServiceStudent {
    private final StudentRepository studentRepository;

    public ServiceStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public Optional<Student> getStudentByID(Long studentId) {
        return this.studentRepository.findById(studentId);
    }

    public Student updateStudent(Long studentId, Student student){
         Optional<Student> optionalStudent = this.studentRepository.findById(studentId);

         if (optionalStudent.isPresent()) {
        Student saveStudent = optionalStudent.get();
        saveStudent.setLastName(student.getLastName());
        saveStudent.setFirstName(student.getFirstName());
        saveStudent.setEmail(student.getEmail());
        saveStudent.setPhoneNumber(student.getPhoneNumber());

        return this.studentRepository.save(saveStudent);
    } else {
        throw new IllegalArgumentException("Student with ID " + studentId + " not found");
    }
    }


    //detete Student
    public void deleteStudent(Long studentId){
         this.studentRepository.deleteById(studentId);
    }

    public void deleteAllStudents(){
        this.studentRepository.deleteAll();
    }
    
}
