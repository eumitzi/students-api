package com.students.api.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "note_activitate")
public class NoteActivitateDto {
    private int id_nota_activitate;
    private int id_nota;
    private String data;
    private int id_student;
    private int id_instanta_disciplina;
    private float nota;


}
