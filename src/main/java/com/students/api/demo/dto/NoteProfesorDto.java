package com.students.api.demo.dto;

public class NoteProfesorDto {

  private String numeStud;
  private String prenumeStud;
  private String tipNota;
  private Float valoareNota;
  private String data;

  public String getNumeStud() {
    return numeStud;
  }

  public void setNumeStud(String numeStud) {
    this.numeStud = numeStud;
  }

  public String getPrenumeStud() {
    return prenumeStud;
  }

  public void setPrenumeStud(String prenumeStud) {
    this.prenumeStud = prenumeStud;
  }

  public String getTipNota() {
    return tipNota;
  }

  public void setTipNota(String tipNota) {
    this.tipNota = tipNota;
  }

  public Float getValoareNota() {
    return valoareNota;
  }

  public void setValoareNota(Float valoareNota) {
    this.valoareNota = valoareNota;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
