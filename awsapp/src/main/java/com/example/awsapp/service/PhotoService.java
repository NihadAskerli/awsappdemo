package com.example.awsapp.service;

import com.example.awsapp.models.Photo;
import com.example.awsapp.repo.PhotoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhotoService {
    private final PhotoRepo photoRepo;
    public String getFilePathById(Long id){
        return photoRepo.getById(id).getPath();
    }
    public Photo savePhoto(Photo photo){
        return photoRepo.save(photo);
    }
//    public List<Photo> getAllPhoto(){
//        return photoRepo.getAll();
//    }
}
