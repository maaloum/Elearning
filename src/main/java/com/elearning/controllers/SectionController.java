package com.elearning.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.models.Section;
import com.elearning.services.ServiceSection;

@RestController
@RequestMapping("/api/v1/sections")
public class SectionController {
    private final ServiceSection serviceSection;

    public SectionController(ServiceSection serviceSection) {
        this.serviceSection = serviceSection;
        }

    @GetMapping
    public List<Section> getAllSection(){
        return this.serviceSection.getAllSections();
    }

   @PostMapping
public Section createSection(@RequestBody Section section) {
    System.out.println(section);
    return serviceSection.createSection(section);
}
    

}
