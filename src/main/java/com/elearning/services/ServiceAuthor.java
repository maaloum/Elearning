package com.elearning.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elearning.models.Author;
import com.elearning.models.Course;
import com.elearning.repositories.AuthorRespository;

import jakarta.transaction.Transactional;

@Service
public class ServiceAuthor {
    
    private final AuthorRespository authorRespository;

    public ServiceAuthor(AuthorRespository authorRespository){
        this.authorRespository = authorRespository;
    }


    public List<Author> getAllAuthors(){
        return this.authorRespository.findAll();
    }

    public Author createAuthor(Author author){
        return this.authorRespository.save(author);
    }

    //update Author
    @SuppressWarnings("null")
    public Author updateAuthor(Long authorId, Author content){
        Author authorToUpdate = this.authorRespository.findById(authorId).get();
        if(authorToUpdate == null){
            System.out.println("author does not exist");
        }
        authorToUpdate.setAge(content.getAge());
        authorToUpdate.setName(content.getName());
        authorToUpdate.setEmail(content.getEmail());
        return this.authorRespository.save(authorToUpdate);
}

    @Transactional
    public List<Course> getCoursersByAuthorId(Long authorId){
        Author author =  this.authorRespository.findById(authorId).
        orElseThrow(() -> new RuntimeException("Course not found with" + authorId));
        return new ArrayList<>(author.getCourses()); 
    }


}