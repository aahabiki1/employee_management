package com.example.learningBiki.demo.repository;


import com.example.learningBiki.demo.model.Departments;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends PagingAndSortingRepository<Departments, Integer> {

}
