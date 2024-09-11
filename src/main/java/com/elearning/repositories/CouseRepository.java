package com.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.models.Course;

@Repository
public interface CouseRepository extends JpaRepository<Course, Long> {
}
