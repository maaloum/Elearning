package com.elearning.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elearning.models.Author;
import com.elearning.repositories.AuthorRespository;

@Service
public class ServiceAuthor {
    
    private final AuthorRespository authorRespository;

    public ServiceAuthor(AuthorRespository authorRespository){
        this.authorRespository = authorRespository;
    }


    public List<Author> getAllAuthors(){
        return this.authorRespository.findAll();
    }

}
