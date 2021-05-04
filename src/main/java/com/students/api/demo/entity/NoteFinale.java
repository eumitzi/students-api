package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_finale")
public class NoteFinale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota_finala;

    @Column(name = "id_nota")
    private int id_nota;

    @Column(name = "data")
    private String data;

    @Column(name = "id_student")
    private int id_student;

    @Column(name = "id_instanta_disciplina")
    private int id_instanta_disciplina;

    @Column(name = "nota_examen")
    private float nota_examen;

    @Column(name = "nota_activitate")
    private float nota_activitate;

    @Column(name = "medie_finala")
    private float medie_finala;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student", referencedColumnName = "id_student")
    private Student student_nf;

    @ManyToOne
    @JoinColumn(name="id_nota", nullable=false)
    private Note note_noteFin;

    public NoteFinale(){}

    public NoteFinale(int id_nota_finala, int id_nota, String data, int id_student, int id_instanta_disciplina, float nota_examen, float nota_activitate, float medie_finala, Student student_nf) {
        this.id_nota_finala = id_nota_finala;
        this.id_nota = id_nota;
        this.data = data;
        this.id_student = id_student;
        this.id_instanta_disciplina = id_instanta_disciplina;
        this.nota_examen = nota_examen;
        this.nota_activitate = nota_activitate;
        this.medie_finala = medie_finala;
        this.student_nf = student_nf;
    }


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

    public int getId_instanta_disciplina() {
        return id_instanta_disciplina;
    }

    public void setId_instanta_disciplina(int id_instanta_disciplina) {
        this.id_instanta_disciplina = id_instanta_disciplina;
    }

    public float getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(float nota_examen) {
        this.nota_examen = nota_examen;
    }

    public float getNota_activitate() {
        return nota_activitate;
    }

    public void setNota_activitate(float nota_activitate) {
        this.nota_activitate = nota_activitate;
    }

    public float getMedie_finala() {
        return medie_finala;
    }

    public void setMedie_finala(float medie_finala) {
        this.medie_finala = medie_finala;
    }

    public Student getStudent_nf() {
        return student_nf;
    }

    public void setStudent_nf(Student student_nf) {
        this.student_nf = student_nf;
    }

    @Override
    public String toString() {
        return "NoteFinale{" +
                "id_nota_finala=" + id_nota_finala +
                ", id_nota=" + id_nota +
                ", data='" + data + '\'' +
                ", id_student=" + id_student +
                ", id_instanta_disciplina=" + id_instanta_disciplina +
                ", nota_examen=" + nota_examen +
                ", nota_activitate=" + nota_activitate +
                ", medie_finala=" + medie_finala +
                ", student_nf=" + student_nf +
                '}';
    }
}
