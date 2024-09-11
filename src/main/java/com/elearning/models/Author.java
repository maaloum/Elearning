package com.elearning.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Table(name ="authors")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String name;
    @Column(
        name = "email",
        unique = true,
        nullable = false
    )
    private String email;

    private int age;
    @ManyToMany(mappedBy= "authors")
    private List<Course> courses;



}
