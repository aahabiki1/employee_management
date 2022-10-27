package com.example.learningBiki.demo.controller;

import com.example.learningBiki.demo.model.Regions;
import com.mysql.cj.x.protobuf.Mysqlx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.learningBiki.demo.service.RegionsService;

import java.util.List;
import java.util.Optional;

@RestController
public class RegionsController {

    @Autowired
    RegionsService regionsService;

@DeleteMapping("/deleteRegion/{regionsId}")
public void deleteRegion(@PathVariable("regionsId") int regionsId){
    regionsService.deleteById(regionsId);
}

    @PostMapping("/saveRegions")
    public ResponseEntity<Regions> addRegions(@RequestBody Regions regions){
       Regions savedRegion = regionsService.addRegions(regions);
        return new ResponseEntity<Regions>(savedRegion,HttpStatus.OK);
    }

 @GetMapping("/regions")
         public ResponseEntity<List<Regions>>getAll(){
     return  new ResponseEntity<>(regionsService.getRegions(), HttpStatus.OK);

 }
 @GetMapping("regions/{regionsId}")
    public ResponseEntity<Regions> getById(@PathVariable int regionsId){
    ResponseEntity<Regions> getById = regionsService.getById(regionsId);
    return  getById;

 }

//


}
