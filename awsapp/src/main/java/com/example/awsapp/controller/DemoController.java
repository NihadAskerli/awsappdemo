package com.example.awsapp.controller;

import com.example.awsapp.models.Photo;
import com.example.awsapp.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class DemoController {
    @Autowired
    PhotoService photoService;
//    @CrossOrigin
    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("yesssss");
    }
    @GetMapping("/photo/{id}")
    @CrossOrigin
    public ResponseEntity<String> demo(@PathVariable("id") Long id){
        return ResponseEntity.ok(photoService.getFilePathById(id));
    }
    @CrossOrigin
    @PostMapping("/photo")
    public ResponseEntity<Photo> demo(@RequestBody Photo photo){
        return ResponseEntity.ok(photoService.savePhoto(photo));
    }
//    @GetMapping("/photos}")
//    public ResponseEntity<List> getAll(){
//        return ResponseEntity.ok(photoService.getAllPhoto());
//    }

}
