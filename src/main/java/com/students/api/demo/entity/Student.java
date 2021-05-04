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

  public Student(){

  }

  public Student(int id_student, String nr_matricol, Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.id_student = id_student;
    this.nr_matricol = nr_matricol;
    this.instantaDisciplinaSet = instantaDisciplinaSet;
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

  public Set<InstantaDisciplina> getInstantaDisciplinaSet() {
    return instantaDisciplinaSet;
  }

  public void setInstantaDisciplinaSet(Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.instantaDisciplinaSet = instantaDisciplinaSet;
  }
}
