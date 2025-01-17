package com.elearning.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.elearning.models.Resource;
@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long>{
    
}
