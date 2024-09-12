package com.elearning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.services.ServiceAuthor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearning.models.Author;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    @Autowired
    private ServiceAuthor authorService;

    @GetMapping("")
    public List<Author> getAllAuthors() {
        return this.authorService.getAllAuthors();
    }
    @PostMapping("")
    public Author createAuther(@RequestBody Author author) {
        
        return this.authorService.createAuthor(author);
    }

    @PutMapping("/{authorId}")
    public Author updateAuthor(@PathVariable Long authorId, @RequestBody Author content) {        
        return this.authorService.updateAuthor(authorId, content);
    }
    
    

    
}
