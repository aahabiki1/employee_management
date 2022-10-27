package com.example.learningBiki.demo.controller;


import com.example.learningBiki.demo.model.Departments;
import com.example.learningBiki.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired(required = true)
    DepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<Departments>> getDepartments() {
        return new ResponseEntity<>(departmentService.getAllDepartment(),HttpStatus.OK);

    }

    @GetMapping("/departments/{departmentId}")
    public ResponseEntity<Departments> getDeparmentById (@PathVariable ("departmentId") int departmentId){
     ResponseEntity<Departments> getById =    departmentService.getDepartmentById(departmentId);
     return  getById;



    }


}
