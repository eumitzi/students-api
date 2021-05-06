package com.students.api.demo.dto;

import com.students.api.demo.entity.AnStudiu;
import com.students.api.demo.entity.CicluStudiu;

import java.util.Objects;
import java.util.Set;

public class PerioadaSemestruDto {
  private int id_perioada_semestru;
  private int numar_semestru;
  private String data_inceput;
  private String data_sfarsit;
  private Set<AnStudiu> anStudiuSet;
  private Set<CicluStudiu> cicluStudiuSet;

  public PerioadaSemestruDto() {}

  public PerioadaSemestruDto(
      int id_perioada_semestru,
      int numar_semestru,
      String data_inceput,
      String data_sfarsit,
      Set<AnStudiu> anStudiuSet,
      Set<CicluStudiu> cicluStudiuSet) {
    this.id_perioada_semestru = id_perioada_semestru;
    this.numar_semestru = numar_semestru;
    this.data_inceput = data_inceput;
    this.data_sfarsit = data_sfarsit;
    this.anStudiuSet = anStudiuSet;
    this.cicluStudiuSet = cicluStudiuSet;
  }

  public int getId_perioada_semestru() {
    return id_perioada_semestru;
  }

  public void setId_perioada_semestru(int id_perioada_semestru) {
    this.id_perioada_semestru = id_perioada_semestru;
  }

  public int getNumar_semestru() {
    return numar_semestru;
  }

  public void setNumar_semestru(int numar_semestru) {
    this.numar_semestru = numar_semestru;
  }

  public String getData_inceput() {
    return data_inceput;
  }

  public void setData_inceput(String data_inceput) {
    this.data_inceput = data_inceput;
  }

  public String getData_sfarsit() {
    return data_sfarsit;
  }

  public void setData_sfarsit(String data_sfarsit) {
    this.data_sfarsit = data_sfarsit;
  }

  public Set<AnStudiu> getAnStudiuSet() {
    return anStudiuSet;
  }

  public void setAnStudiuSet(Set<AnStudiu> anStudiuSet) {
    this.anStudiuSet = anStudiuSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PerioadaSemestruDto that = (PerioadaSemestruDto) o;
    return id_perioada_semestru == that.id_perioada_semestru
        && numar_semestru == that.numar_semestru
        && data_inceput.equals(that.data_inceput)
        && data_sfarsit.equals(that.data_sfarsit)
        && anStudiuSet.equals(that.anStudiuSet)
        && cicluStudiuSet.equals(that.cicluStudiuSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id_perioada_semestru,
        numar_semestru,
        data_inceput,
        data_sfarsit,
        anStudiuSet,
        cicluStudiuSet);
  }

  public Set<CicluStudiu> getCicluStudiuSet() {
    return cicluStudiuSet;
  }

  public void setCicluStudiuSet(Set<CicluStudiu> cicluStudiuSet) {
    this.cicluStudiuSet = cicluStudiuSet;
  }
}
