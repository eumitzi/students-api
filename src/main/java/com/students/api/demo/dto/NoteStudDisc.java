package com.students.api.demo.dto;

public class NoteStudDisc {
  private String numeStudent;
  private String prenumeStudent;
  private String numeDisciplina;

  public String getNumeStudent() {
    return numeStudent;
  }

  public void setNumeStudent(String numeStudent) {
    this.numeStudent = numeStudent;
  }

  public String getPrenumeStudent() {
    return prenumeStudent;
  }

  public void setPrenumeStudent(String prenumeStudent) {
    this.prenumeStudent = prenumeStudent;
  }

  public String getNumeDisciplina() {
    return numeDisciplina;
  }

  public void setNumeDisciplina(String numeDisciplina) {
    this.numeDisciplina = numeDisciplina;
  }
  public NoteStudDisc(){

  }

    public NoteStudDisc(String numeStudent, String prenumeStudent, String numeDisciplina) {
        this.numeStudent = numeStudent;
        this.prenumeStudent = prenumeStudent;
        this.numeDisciplina = numeDisciplina;
    }
}
