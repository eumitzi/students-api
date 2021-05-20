package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_examen")
public class NoteExamen {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nota_examen")
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota")
  private float valoareNota;

  @ManyToOne
  @JoinColumn(name = "id_student", referencedColumnName = "id_student")
  private Student student;
  @ManyToOne
  @JoinColumn(name = "id_nota", referencedColumnName = "id_nota")
  private Nota nota;

  @ManyToOne
  @JoinColumn(name = "id_instanta_disciplina", referencedColumnName = "id_instanta_disciplina")
  private InstantaDisciplina instantaDisciplina;

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

  public float getValoareNota() {
    return valoareNota;
  }

  public void setValoareNota(float valoareNota) {
    this.valoareNota = valoareNota;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Nota getNota() {
    return nota;
  }

  public void setNota(Nota nota) {
    this.nota = nota;
  }

  public InstantaDisciplina getInstantaDisciplina() {
    return instantaDisciplina;
  }

  public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
    this.instantaDisciplina = instantaDisciplina;
  }
}
