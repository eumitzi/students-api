package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
public class StudentDto {
    private int id_student;
    private String nr_matricol;
    private int id_persoana;

}
