package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_finale")
public class NoteFinale {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nota_finala")
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota_examen")
  private float notaExamen;

  @Column(name = "nota_activitate")
  private float notaActivitate;

  @Column(name = "medie_finala")
  private float medieFinala;

  @ManyToOne
  @JoinColumn(name = "id_student", referencedColumnName = "id_student")
  private Student student;

  @ManyToOne
  @JoinColumn(name = "id_instanta_disciplina", referencedColumnName = "id_instanta_disciplina")
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  @JoinColumn(name = "id_nota", referencedColumnName = "id_nota")
  private Nota nota;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public float getNotaExamen() {
    return notaExamen;
  }

  public void setNotaExamen(float notaExamen) {
    this.notaExamen = notaExamen;
  }

  public float getNotaActivitate() {
    return notaActivitate;
  }

  public void setNotaActivitate(float notaActivitate) {
    this.notaActivitate = notaActivitate;
  }

  public float getMedieFinala() {
    return medieFinala;
  }

  public void setMedieFinala(float medieFinala) {
    this.medieFinala = medieFinala;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public InstantaDisciplina getInstantaDisciplina() {
    return instantaDisciplina;
  }

  public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
    this.instantaDisciplina = instantaDisciplina;
  }

  public Nota getNota() {
    return nota;
  }

  public void setNota(Nota nota) {
    this.nota = nota;
  }
}
