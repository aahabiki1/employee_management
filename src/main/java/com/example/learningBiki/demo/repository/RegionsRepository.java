package com.example.learningBiki.demo.repository;

import com.example.learningBiki.demo.model.Regions;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepository extends PagingAndSortingRepository<Regions,Integer>{

}
