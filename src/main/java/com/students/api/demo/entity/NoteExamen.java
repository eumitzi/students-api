package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_examen")
public class NoteExamen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota_examen;

    @Column(name = "data")
    private String data;

    @Column(name = "id_student")
    private int id_student;

    @Column(name = "id_instanta_disciplina")
    private int id_instanta_disciplina;

    @Column(name = "nota")
    private float nota;

    @Override
    public String toString() {
        return "NoteExamen{" +
                "id_nota_examen=" + id_nota_examen +
                ", data='" + data + '\'' +
                ", id_student=" + id_student +
                ", id_instanta_disciplina=" + id_instanta_disciplina +
                ", nota=" + nota +
                ", student_noteEx=" + student_noteEx +
                ", nota_notaEx=" + nota_notaEx +
                '}';
    }

    @ManyToOne
    @JoinColumn (name="id_student", nullable=false)
    private Student student_noteEx;

    @ManyToOne
    @JoinColumn (name="id_nota", nullable=false)
    private Note nota_notaEx;

    public NoteExamen(){}

    public NoteExamen(int id_nota_examen, String data, int id_student, int id_instanta_disciplina, float nota, Student student_noteEx, Note nota_notaEx) {
        this.id_nota_examen = id_nota_examen;
        this.data = data;
        this.id_student = id_student;
        this.id_instanta_disciplina = id_instanta_disciplina;
        this.nota = nota;
        this.student_noteEx = student_noteEx;
        this.nota_notaEx = nota_notaEx;
    }

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

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_instanta_disciplina() {
        return id_instanta_disciplina;
    }

    public void setId_instanta_disciplina(int id_instanta_disciplina) {
        this.id_instanta_disciplina = id_instanta_disciplina;
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
        return nota_notaEx;
    }

    public void setNota_notaEx(Note nota_notaEx) {
        this.nota_notaEx = nota_notaEx;
    }
}
