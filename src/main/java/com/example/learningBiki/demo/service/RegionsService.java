package com.example.learningBiki.demo.service;

import com.example.learningBiki.demo.model.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.learningBiki.demo.repository.RegionsRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class RegionsService  {
   @Autowired
    private RegionsRepository regionsRepository;

   public   List<Regions> getRegions(){
      List<Regions> result = new LinkedList<>();

        regionsRepository.findAll().forEach(result::add);
    return  result;
    }


    public Optional<Regions> getById(Integer regionsId) {
       return regionsRepository.findById(regionsId);
    }
}
