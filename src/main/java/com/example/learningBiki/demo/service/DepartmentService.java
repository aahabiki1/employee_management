package com.example.learningBiki.demo.service;


import com.example.learningBiki.demo.model.Departments;
import com.example.learningBiki.demo.repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DepartmentService {
    @Autowired(required = true)
   private DepartmentsRepository departmentsRepository;

    public List<Departments> getAllDepartment() {

        return (List<Departments>) departmentsRepository.findAll();


    }



    public ResponseEntity<Departments> getDepartmentById(int departmentId) {
       Departments getById = (Departments) departmentsRepository.findById(departmentId).orElse(null);
    return  new ResponseEntity<Departments>(getById,HttpStatus.OK);
    }
}
