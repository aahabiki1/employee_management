package com.example.learningBiki.demo.controller;


import com.example.learningBiki.demo.model.Departments;
import com.example.learningBiki.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<Departments> getDepartments() {
        return new ResponseEntity<Departments>(departmentService.getDepartment(), HttpStatus.OK);
    }
}
