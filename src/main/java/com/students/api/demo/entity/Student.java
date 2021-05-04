package com.students.api.demo.entity;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "studenti")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_student;

    @Column(name = "nr_matricol")
    private String nr_matricol;

    @Column(name = "")
    private int id_persoana;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persoana", referencedColumnName = "id_persoana")
    private Persoane persoana_stud;

    @OneToOne(mappedBy = "student_nf")
    private NoteFinale noteFinale_stud;

    @OneToMany(mappedBy="student_noteEx")
    private Set<NoteExamen> noteExamen;

    @OneToMany(mappedBy="student_noteAc")
    private Set<NoteActivitate> noteActivitate;

    public Student() { }

    public Student(int id_student, String nr_matricol, int id_persoana) {
        this.id_student = id_student;
        this.nr_matricol = nr_matricol;
        this.id_persoana = id_persoana;
    }


    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getNr_matricol() {
        return nr_matricol;
    }

    public void setNr_matricol(String nr_matricol) {
        this.nr_matricol = nr_matricol;
    }

    public int getId_persoana() {
        return id_persoana;
    }

    public void setId_persoana(int id_persoana) {
        this.id_persoana = id_persoana;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", nr_matricol='" + nr_matricol + '\'' +
                ", id_persoana=" + id_persoana +
                '}';
    }
}
