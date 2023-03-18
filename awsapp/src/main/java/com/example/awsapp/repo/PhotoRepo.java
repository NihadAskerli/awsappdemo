package com.example.awsapp.repo;

import com.example.awsapp.models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepo extends JpaRepository<Photo,Long> {
    Photo getById(Long id);

//    List<Photo>getAll();
}
