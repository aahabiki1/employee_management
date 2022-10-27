package com.example.learningBiki.demo.controller;

import com.example.learningBiki.demo.model.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.learningBiki.demo.service.RegionsService;

import java.util.List;
import java.util.Optional;

@RestController
public class RegionsController {

    @Autowired
    RegionsService regionsService;
    @Autowired
    Regions regions;

 @GetMapping("/regions")
         public ResponseEntity<List<Regions>>getAll(){
     return  new ResponseEntity<>(regionsService.getRegions(), HttpStatus.OK);

 }
 @GetMapping("regions/{regionsId}")
    public ResponseEntity<Regions>getById(@PathVariable Integer regionsId){
     Optional<Regions> region = regionsService.getById(regionsId);
    if(region.isPresent()){
        return new ResponseEntity<>(regions.getRegionsId(),HttpStatus.OK);
    }
    else {
        throw  new RuntimeException();
    }
 }
}
