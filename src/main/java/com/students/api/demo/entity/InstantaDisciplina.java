package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "instanta_disciplina")
public class InstantaDisciplina {

  @Id
  @Column(name = "id_instanta_disciplina")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "numar_credite")
  private int nr_credite;

  @Column(name = "semestru")
  private int semestru;

  public float getFactor_k() {
    return factor_k;
  }

  public void setFactor_k(float factor_k) {
    this.factor_k = factor_k;
  }

  @Column(name = "factor_k")
  private float factor_k;

  @ManyToOne(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  @JoinColumn(name = "id_profesor")
  private Profesor profesor;

  @OneToOne
  @JoinColumn(name = "id_an_universitar", referencedColumnName = "id_an_universitar")
  private AnUniversitar anUniversitar;

  @ManyToOne
  @JoinColumn(name = "id_student", nullable = false)
  private Student student_instDisc;

  public DisciplinaGeneral getDisciplinaGeneral() {
    return disciplinaGeneral;
  }

  public void setDisciplinaGeneral(DisciplinaGeneral disciplinaGeneral) {
    this.disciplinaGeneral = disciplinaGeneral;
  }

  public InstantaDisciplina(
      int id,
      int nr_credite,
      int semestru,
      float factor_k,
      AnUniversitar anUniversitar,
      Student student_instDisc,
      DisciplinaGeneral disciplinaGeneral,
      Profesor profesor) {
    this.id = id;
    this.nr_credite = nr_credite;
    this.semestru = semestru;
    this.factor_k = factor_k;
    this.profesor = profesor;
    this.anUniversitar = anUniversitar;
    this.student_instDisc = student_instDisc;
    this.disciplinaGeneral = disciplinaGeneral;
    this.profesor = profesor;
  }

  @ManyToOne
  @JoinColumn(name = "id_disciplina")
  private DisciplinaGeneral disciplinaGeneral;

  public InstantaDisciplina() {}

  public int getId() {
    return id;
  }

  public void setId(int id_instanta_disciplina) {
    this.id = id_instanta_disciplina;
  }

  public int getNr_credite() {
    return nr_credite;
  }

  public void setNr_credite(int nr_credite) {
    this.nr_credite = nr_credite;
  }

  public int getSemestru() {
    return semestru;
  }

  public void setSemestru(int semestru) {
    this.semestru = semestru;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public AnUniversitar getAnUniversitar() {
    return anUniversitar;
  }

  public void setAnUniversitar(AnUniversitar anUniversitar) {
    this.anUniversitar = anUniversitar;
  }

  public Student getStudent_instDisc() {
    return student_instDisc;
  }

  public void setStudent_instDisc(Student student_instDisc) {
    this.student_instDisc = student_instDisc;
  }

  @Override
  public String toString() {
    return "InstantaDisciplina{"
        + "id="
        + id
        + ", nr_credite="
        + nr_credite
        + ", semestru="
        + semestru
        + ", factor_k="
        + factor_k
        + ", profesor="
        + profesor
        + ", anUniversitar="
        + anUniversitar
        + ", student_instDisc="
        + student_instDisc
        + ", disciplinaGeneral="
        + disciplinaGeneral
        + '}';
  }
}
