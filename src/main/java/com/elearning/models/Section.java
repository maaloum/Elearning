package com.elearning.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "sections")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long sectionId;
    private String name;
    private String description;
    private int sectionOrder;
    @ManyToOne
    @JoinColumn(name = "courseID")
    //  @JsonManagedReference
    // @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, 
    // property = "course_id")
    @JsonBackReference
    @JsonIgnore
    private Course course;
    @OneToMany(mappedBy="section")
    private List<Lecture> lectures;
}
