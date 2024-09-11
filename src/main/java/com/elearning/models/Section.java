package com.elearning.models;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

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
    private int order;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
}
