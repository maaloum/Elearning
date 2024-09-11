package com.elearning.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.elearning.models.Video;
import com.elearning.services.ServiceVideo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/video") 
public class VideoController {
    private final ServiceVideo serviceVideo;

    public VideoController(ServiceVideo serviceVideo){
        this.serviceVideo = serviceVideo;
    }
    @PostMapping("")
    public Video uploadVideo(@RequestBody Video video) {

        return this.serviceVideo.uploadVideo(video);
    }
    
}
