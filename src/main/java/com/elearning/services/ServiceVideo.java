package com.elearning.services;

import org.springframework.stereotype.Service;
import com.elearning.models.Video;
import com.elearning.repositories.VideoRepository;

@Service
public class ServiceVideo {
    private final VideoRepository videoRepository;

    public ServiceVideo(VideoRepository videoRepository){
        this.videoRepository = videoRepository;
    }

    public Video uploadVideo(Video video){
        return this.videoRepository.save(video);
    }
}
