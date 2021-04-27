package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
public class NoteFinaleDto {

    private int id_nota_finala;
    private int id_nota;
    private String data;
    private int id_student;
    private float nota;

}
