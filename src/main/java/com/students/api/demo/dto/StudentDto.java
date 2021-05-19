package com.students.api.demo.dto;

import com.students.api.demo.entity.*;

import java.util.Set;

public class StudentDto {

  private int id_student;
  private String nr_matricol;
  private Set<InstantaDisciplina> instantaDisciplinaSet;
  private Persoana persoana_stud;
  private NoteFinale noteFinale_stud;
  private Set<NoteExamen> noteExamen;
  private Set<NotaActivitate> notaActivitate;

  public StudentDto() {}

  public StudentDto(
      int id_student,
      String nr_matricol,
      Set<InstantaDisciplina> instantaDisciplinaSet,
      Persoana persoana_stud,
      NoteFinale noteFinale_stud,
      Set<NoteExamen> noteExamen,
      Set<NotaActivitate> notaActivitate) {
    this.id_student = id_student;
    this.nr_matricol = nr_matricol;
    this.instantaDisciplinaSet = instantaDisciplinaSet;
    this.persoana_stud = persoana_stud;
    this.noteFinale_stud = noteFinale_stud;
    this.noteExamen = noteExamen;
    this.notaActivitate = notaActivitate;
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

  public Persoana getPersoana_stud() {
    return persoana_stud;
  }

  public void setPersoana_stud(Persoana persoana_stud) {
    this.persoana_stud = persoana_stud;
  }

  public NoteFinale getNoteFinale_stud() {
    return noteFinale_stud;
  }

  public void setNoteFinale_stud(NoteFinale noteFinale_stud) {
    this.noteFinale_stud = noteFinale_stud;
  }

  public Set<NoteExamen> getNoteExamen() {
    return noteExamen;
  }

  public void setNoteExamen(Set<NoteExamen> noteExamen) {
    this.noteExamen = noteExamen;
  }

  public Set<NotaActivitate> getNoteActivitate() {
    return notaActivitate;
  }

  public void setNoteActivitate(Set<NotaActivitate> notaActivitate) {
    this.notaActivitate = notaActivitate;
  }
}
