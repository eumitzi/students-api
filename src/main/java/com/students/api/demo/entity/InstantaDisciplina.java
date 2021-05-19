package com.students.api.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "instanta_disciplina")
public class InstantaDisciplina {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_instanta_disciplina")
  private int id;

  @Column(name = "numar_credite")
  private int nrCredite;

  @Column(name = "semestru")
  private int semestru;

  @Column(name = "factor_k")
  private float factorK;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_an_universitar", referencedColumnName = "id_an_universitar")
  private AnUniversitar anUniversitar;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_student", referencedColumnName = "id_student")
  private Student student;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_disciplina", referencedColumnName = "id_disciplina")
  private DisciplinaGeneral disciplinaGeneral;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_an_studiu", referencedColumnName = "id_an_studiu")
  private AnStudiu anStudiu;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesori")
  private Profesor profesor;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNrCredite() {
    return nrCredite;
  }

  public void setNrCredite(int nrCredite) {
    this.nrCredite = nrCredite;
  }

  public int getSemestru() {
    return semestru;
  }

  public void setSemestru(int semestru) {
    this.semestru = semestru;
  }

  public float getFactorK() {
    return factorK;
  }

  public void setFactorK(float factorK) {
    this.factorK = factorK;
  }

  public AnUniversitar getAnUniversitar() {
    return anUniversitar;
  }

  public void setAnUniversitar(AnUniversitar anUniversitar) {
    this.anUniversitar = anUniversitar;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public DisciplinaGeneral getDisciplinaGeneral() {
    return disciplinaGeneral;
  }

  public void setDisciplinaGeneral(DisciplinaGeneral disciplinaGeneral) {
    this.disciplinaGeneral = disciplinaGeneral;
  }

  public AnStudiu getAnStudiu() {
    return anStudiu;
  }

  public void setAnStudiu(AnStudiu anStudiu) {
    this.anStudiu = anStudiu;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }
}
