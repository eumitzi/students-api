package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_activitate")
public class NoteActivitate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota_activitate;

    @Column(name = "id_nota")
    private int id_nota;

    @Column(name = "data")
    private String data;

    @Column(name = "id_student")
    private int id_student;

    @Column(name = "id_instanta_disciplina")
    private int id_instanta_disciplina;

    @Column(name = "nota")
    private float nota;

    @ManyToOne
    @JoinColumn(name="id_student", nullable=false)
    private Student student_noteAc;

    public NoteActivitate(){}

    public NoteActivitate(int id_nota_activitate, int id_nota, String data, int id_student, int id_instanta_disciplina, float nota) {
        this.id_nota_activitate = id_nota_activitate;
        this.id_nota = id_nota;
        this.data = data;
        this.id_student = id_student;
        this.id_instanta_disciplina = id_instanta_disciplina;
        this.nota = nota;
    }

    public int getId_nota_activitate() {
        return id_nota_activitate;
    }

    public void setId_nota_activitate(int id_nota_activitate) {
        this.id_nota_activitate = id_nota_activitate;
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


    @Override
    public String toString() {
        return "NoteActivitate{" +
                "id_nota_activitate=" + id_nota_activitate +
                ", id_nota=" + id_nota +
                ", data='" + data + '\'' +
                ", id_student=" + id_student +
                ", id_instanta_disciplina=" + id_instanta_disciplina +
                ", nota=" + nota +
                ", student_noteAc=" + student_noteAc +
                '}';
    }
}
