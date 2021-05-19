package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_activitate")
public class NotaActivitate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nota_activitate")
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "nota")
  private float valoareNota;

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
