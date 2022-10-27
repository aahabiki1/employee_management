package com.example.learningBiki.demo.service;

import com.example.learningBiki.demo.model.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.learningBiki.demo.repository.RegionsRepository;

import javax.swing.plaf.synth.Region;
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


    public ResponseEntity<Regions> getById(Integer regionsId) {
        Regions getByid = regionsRepository.findById(regionsId).orElse(null);
        return new ResponseEntity<Regions>(getByid, HttpStatus.OK);

    }

    public Regions addRegions(Regions regions) {
       Regions saveRegion = regionsRepository.save(regions);
       return saveRegion;
    }

    public void deleteById(Integer regions_id) {

       regionsRepository.deleteById(regions_id);

    }

//    public ResponseEntity<Regions> updateRegion() {
//       Regions putRegion = regionsRepository.
//    }
}
