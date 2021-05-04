package com.students.api.demo.service;

import com.students.api.demo.repository.StudentRepository;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class DataService {
    private final StudentRepository studentRepository;

    public DataService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
}
