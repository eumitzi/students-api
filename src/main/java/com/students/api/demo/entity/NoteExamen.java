package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_examen")
public class NoteExamen {

    public Note getNote_noteEx() {
        return note_noteEx;
    }

    @Override
    public String toString() {
        return "NoteExamen{" +
                "id_nota_examen=" + id_nota_examen +
                ", data='" + data + '\'' +
                ", nota=" + nota +
                ", student_noteEx=" + student_noteEx +
                ", note_noteEx=" + note_noteEx +
                ", instantaDisciplina_noteEx=" + instantaDisciplina_noteEx +
                '}';
    }

    public void setNote_noteEx(Note note_noteEx) {
        this.note_noteEx = note_noteEx;
    }

    public InstantaDisciplina getInstantaDisciplina_noteEx() {
        return instantaDisciplina_noteEx;
    }

    public void setInstantaDisciplina_noteEx(InstantaDisciplina instantaDisciplina_noteEx) {
        this.instantaDisciplina_noteEx = instantaDisciplina_noteEx;
    }

    public NoteExamen(int id_nota_examen, String data, float nota, Student student_noteEx, Note note_noteEx, InstantaDisciplina instantaDisciplina_noteEx) {
        this.id_nota_examen = id_nota_examen;
        this.data = data;
        this.nota = nota;
        this.student_noteEx = student_noteEx;
        this.note_noteEx = note_noteEx;
        this.instantaDisciplina_noteEx = instantaDisciplina_noteEx;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota_examen;

    @Column(name = "data")
    private String data;

    @Column(name = "nota")
    private float nota;

    @ManyToOne
    @JoinColumn (name="id_student", nullable=false)
    private Student student_noteEx;

    @ManyToOne
    @JoinColumn (name="id_nota", nullable=false)
    private Note note_noteEx;

    @ManyToOne
    @JoinColumn(name = "id_instanta_disciplina", nullable = false)
    private InstantaDisciplina instantaDisciplina_noteEx;


    public NoteExamen(){}


    public int getId_nota_examen() {
        return id_nota_examen;
    }

    public void setId_nota_examen(int id_nota_examen) {
        this.id_nota_examen = id_nota_examen;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Student getStudent_noteEx() {
        return student_noteEx;
    }

    public void setStudent_noteEx(Student student_noteEx) {
        this.student_noteEx = student_noteEx;
    }

    public Note getNota_notaEx() {
        return note_noteEx;
    }

    public void setNota_notaEx(Note nota_notaEx) {
        this.note_noteEx = nota_notaEx;
    }

}
