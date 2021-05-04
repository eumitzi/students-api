package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "note_finale")
public class NoteFinale {

    private int id_nota_finala;
    private int id_nota;
    private String data;
    private int id_student;
    private float nota;

    public int getId_nota_finala() {
        return id_nota_finala;
    }

    public void setId_nota_finala(int id_nota_finala) {
        this.id_nota_finala = id_nota_finala;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
