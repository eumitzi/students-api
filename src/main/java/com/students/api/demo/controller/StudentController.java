package com.students.api.demo.controller;

import com.students.api.demo.repository.StudentRepository;
import com.students.api.demo.service.DataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentRepository studentRepository;
    private final DataService dataService;

    public StudentController(StudentRepository studentRepository, DataService dataService){
        this.studentRepository = studentRepository;
        this.dataService = dataService;
    }
}
