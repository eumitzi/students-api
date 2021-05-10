package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "studenti")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_student")
    private int id_student;

    @Column(name = "nr_matricol")
    private String nr_matricol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persoana", referencedColumnName = "id_persoana")
    private Persoane persoana;

    public Student() {}

    public int getId_student() {
        return id_student;
    }

    public Student(int id_student, String nr_matricol, Persoane persoana) {
        this.id_student = id_student;
        this.nr_matricol = nr_matricol;
        this.persoana = persoana;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getNr_matricol() {
        return nr_matricol;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", nr_matricol='" + nr_matricol + '\'' +
                ", persoana=" + persoana +
                '}';
    }

    public Persoane getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoane persoana) {
        this.persoana = persoana;
    }

    public void setNr_matricol(String nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

}
