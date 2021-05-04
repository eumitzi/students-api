package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "studenti")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_student")
  private int id_student;

  @Column(name = "nr_matricol")
  private String nr_matricol;

  @OneToMany(mappedBy = "student_instDisc")
  private Set<InstantaDisciplina> instantaDisciplinaSet;

  public Student() {}

  public Student(
      int id_student, String nr_matricol, Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.id_student = id_student;
    this.nr_matricol = nr_matricol;
    this.instantaDisciplinaSet = instantaDisciplinaSet;
  }

  public int getId_student() {
    return id_student;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_persoana", referencedColumnName = "id_persoana")
  private Persoane persoana_stud;

  @OneToOne(mappedBy = "student_nf")
  private NoteFinale noteFinale_stud;

  @OneToMany(mappedBy = "student_noteEx")
  private Set<NoteExamen> noteExamen;

  @OneToMany(mappedBy = "student_noteAc")
  private Set<NoteActivitate> noteActivitate;

  public Set<InstantaDisciplina> getInstantaDisciplinaSet() {
    return instantaDisciplinaSet;
  }

  public void setInstantaDisciplinaSet(Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.instantaDisciplinaSet = instantaDisciplinaSet;
  }

  @Override
  public String toString() {
    return "Student{" + "id_student=" + id_student + ", nr_matricol='" + nr_matricol + '\'' + '}';
  }
}
