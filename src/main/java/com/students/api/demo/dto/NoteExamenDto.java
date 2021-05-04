package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
public class NoteExamenDto {
    private int id_nota_examen;
    private int id_nota;
    private String data;
    private int id_student;
    private int id_instanta_disciplina;
    private float nota;

}
