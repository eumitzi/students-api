package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_activitate")
public class NoteActivitate {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_nota_activitate;

  @Column(name = "data")
  private String data;

  @Column(name = "nota")
  private float nota;

  @ManyToOne
  @JoinColumn(name = "id_student", nullable = false)
  private Student student_noteAc;

  @ManyToOne
  @JoinColumn(name = "id_instanta_disciplina", nullable = false)
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  @JoinColumn(name = "id_nota", nullable = false)
  private Note note_noteAc;

  public NoteActivitate() {}

  @Override
  public String toString() {
    return "NoteActivitate{"
        + "id_nota_activitate="
        + id_nota_activitate
        + ", data='"
        + data
        + '\''
        + ", nota="
        + nota
        + ", student_noteAc="
        + student_noteAc
        + ", instantaDisciplina="
        + instantaDisciplina
        + ", note_noteAc="
        + note_noteAc
        + '}';
  }

  public NoteActivitate(
      int id_nota_activitate,
      String data,
      float nota,
      Student student_noteAc,
      InstantaDisciplina instantaDisciplina,
      Note note_noteAc) {
    this.id_nota_activitate = id_nota_activitate;
    this.data = data;
    this.nota = nota;
    this.student_noteAc = student_noteAc;
    this.instantaDisciplina = instantaDisciplina;
    this.note_noteAc = note_noteAc;
  }

  public int getId_nota_activitate() {
    return id_nota_activitate;
  }

  public void setId_nota_activitate(int id_nota_activitate) {
    this.id_nota_activitate = id_nota_activitate;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public float getNota() {
    return nota;
  }

  public void setNota(float nota) {
    this.nota = nota;
  }

  public Student getStudent_noteAc() {
    return student_noteAc;
  }

  public void setStudent_noteAc(Student student_noteAc) {
    this.student_noteAc = student_noteAc;
  }

  public InstantaDisciplina getInstantaDisciplina() {
    return instantaDisciplina;
  }

  public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
    this.instantaDisciplina = instantaDisciplina;
  }

  public Note getNote_noteAc() {
    return note_noteAc;
  }

  public void setNote_noteAc(Note note_noteAc) {
    this.note_noteAc = note_noteAc;
  }
}
