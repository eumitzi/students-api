package com.students.api.demo.dto;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Note;
import com.students.api.demo.entity.Student;

public class NoteFinaleDto {

    private int id_nota_finala;
    private String data;
    private float notaExamen;
    private float notaActivitate;
    private float medieFinala;
    private Student student;
    private InstantaDisciplina instantaDisciplina;
    private Note note_noteFin;

    public NoteFinaleDto(){

    }

    public NoteFinaleDto(int id_nota_finala, String data, float notaExamen, float notaActivitate, float medieFinala, Student student, InstantaDisciplina instantaDisciplina, Note note_noteFin) {
        this.id_nota_finala = id_nota_finala;
        this.data = data;
        this.notaExamen = notaExamen;
        this.notaActivitate = notaActivitate;
        this.medieFinala = medieFinala;
        this.student = student;
        this.instantaDisciplina = instantaDisciplina;
        this.note_noteFin = note_noteFin;
    }

    public int getId_nota_finala() {
        return id_nota_finala;
    }

    public void setId_nota_finala(int id_nota_finala) {
        this.id_nota_finala = id_nota_finala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(float notaExamen) {
        this.notaExamen = notaExamen;
    }

    public float getNotaActivitate() {
        return notaActivitate;
    }

    public void setNotaActivitate(float notaActivitate) {
        this.notaActivitate = notaActivitate;
    }

    public float getMedieFinala() {
        return medieFinala;
    }

    public void setMedieFinala(float medieFinala) {
        this.medieFinala = medieFinala;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public InstantaDisciplina getInstantaDisciplina() {
        return instantaDisciplina;
    }

    public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
        this.instantaDisciplina = instantaDisciplina;
    }

    public Note getNote_noteFin() {
        return note_noteFin;
    }

    public void setNote_noteFin(Note note_noteFin) {
        this.note_noteFin = note_noteFin;
    }
}
