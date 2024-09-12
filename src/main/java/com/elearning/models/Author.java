package com.elearning.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @ManyToMany(mappedBy= "authors", fetch = FetchType.LAZY)
    @JsonBackReference 
    private Set<Course> courses;

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}'; // Do not include `courses` in the toString method
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorId, author.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId);
    }



}
