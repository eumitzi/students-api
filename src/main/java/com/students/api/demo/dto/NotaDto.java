package com.students.api.demo.dto;

import java.util.List;
import java.util.Map;

public class NotaDto {

  public NotaDto(List<Map<String, Float>> discNota) {
    this.discNota = discNota;
  }

  public NotaDto(){

  }
  public List<Map<String, Float>> getDiscNota() {
    return discNota;
  }

  public void setDiscNota(List<Map<String, Float>> discNota) {
    this.discNota = discNota;
  }

  private List<Map<String, Float>> discNota;
}
