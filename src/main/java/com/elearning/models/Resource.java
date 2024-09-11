package com.elearning.models;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Resources")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;
    private String name;
    private int size;
    private String url;
        @OneToOne
    @JoinColumn(name = "lectureId")
    private Lecture lecture;

    
}
