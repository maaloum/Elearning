package com.elearning.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lectures")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lectureId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "sectionID")
    private Section section;

}
