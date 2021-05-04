package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "discipline_general")
public class DisciplinaGeneral {


    private int id_disciplina;
    private String nume;

    public DisciplinaGeneral(){

    }

    public DisciplinaGeneral(int id_disciplina, String nume) {
        this.id_disciplina = id_disciplina;
        this.nume = nume;
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
