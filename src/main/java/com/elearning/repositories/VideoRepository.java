package com.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
