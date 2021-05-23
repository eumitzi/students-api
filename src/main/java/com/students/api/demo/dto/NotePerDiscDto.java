package com.students.api.demo.dto;

public class NotePerDiscDto {

  private String tipNota;
  private String data;
  private Float valoareNota;

  public String getTipNota() {
    return tipNota;
  }

  public void setTipNota(String tipNota) {
    this.tipNota = tipNota;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Float getValoareNota() {
    return valoareNota;
  }

  public void setValoareNota(Float valoareNota) {
    this.valoareNota = valoareNota;
  }
}
