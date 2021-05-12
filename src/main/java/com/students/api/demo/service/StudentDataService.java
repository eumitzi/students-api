package com.students.api.demo.service;

import com.students.api.demo.repository.StudentRepository;

public class StudentDataService {

    private StudentRepository studentRepository;
    //private
    // student/{idStudent}/note?an_studiu=n
    public StudentDataService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }
}
