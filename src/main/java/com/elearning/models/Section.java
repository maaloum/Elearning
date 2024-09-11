package com.elearning.models;

import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
}
