package com.students.api.demo.dto;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Note;
import com.students.api.demo.entity.Student;

import java.util.Objects;

public class NoteExamenDto {

  private int id_nota_examen;
  private String data;
  private Student student_noteEx;
  private Note note_noteEx;
  private InstantaDisciplina instantaDisciplina;
  private float nota;

  public NoteExamenDto() {}

  public NoteExamenDto(
      int id_nota_examen,
      String data,
      Student student_noteEx,
      Note note_noteEx,
      InstantaDisciplina instantaDisciplina,
      float nota) {
    this.id_nota_examen = id_nota_examen;
    this.data = data;
    this.student_noteEx = student_noteEx;
    this.note_noteEx = note_noteEx;
    this.instantaDisciplina = instantaDisciplina;
    this.nota = nota;
  }

  public int getId_nota_examen() {
    return id_nota_examen;
  }

  public void setId_nota_examen(int id_nota_examen) {
    this.id_nota_examen = id_nota_examen;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Student getStudent_noteEx() {
    return student_noteEx;
  }

  public void setStudent_noteEx(Student student_noteEx) {
    this.student_noteEx = student_noteEx;
  }

  public Note getNote_noteEx() {
    return note_noteEx;
  }

  public void setNote_noteEx(Note note_noteEx) {
    this.note_noteEx = note_noteEx;
  }

  public InstantaDisciplina getInstantaDisciplina() {
    return instantaDisciplina;
  }

  public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
    this.instantaDisciplina = instantaDisciplina;
  }

  public float getNota() {
    return nota;
  }

  public void setNota(float nota) {
    this.nota = nota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NoteExamenDto that = (NoteExamenDto) o;
    return id_nota_examen == that.id_nota_examen
        && Float.compare(that.nota, nota) == 0
        && data.equals(that.data)
        && student_noteEx.equals(that.student_noteEx)
        && note_noteEx.equals(that.note_noteEx)
        && instantaDisciplina.equals(that.instantaDisciplina);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id_nota_examen, data, student_noteEx, note_noteEx, instantaDisciplina, nota);
  }
}
