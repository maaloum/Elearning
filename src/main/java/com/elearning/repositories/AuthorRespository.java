package com.elearning.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.elearning.models.Author;

@Repository
public interface AuthorRespository extends JpaRepository<Author, Long> {

}
