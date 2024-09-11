package com.elearning.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

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
    private Course course;

    @OneToMany(mappedBy="section")
    private List<Lecture> lectures;
}
