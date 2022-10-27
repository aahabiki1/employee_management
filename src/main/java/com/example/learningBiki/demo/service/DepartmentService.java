package com.example.learningBiki.demo.service;


import com.example.learningBiki.demo.model.Departments;
import com.example.learningBiki.demo.repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentsRepository departmentsRepository;

    public List<Departments> getDepartment() {
        List<Departments> department = new LinkedList<>();
        departmentsRepository.findAll().forEach(department::add);
        return  department;

    }
}
