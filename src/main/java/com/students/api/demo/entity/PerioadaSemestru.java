package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "perioada_semestru")
public class PerioadaSemestru {

  @Id
  @Column(name = "id_perioada_semestru")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_perioada_semestru;

  @Column(name = "numar_semestru")
  private int numar_semestru;

  @Column(name = "data_inceput")
  private String data_inceput;

  @Column(name = "data_sfarsit")
  private String data_sfarsit;

  @ManyToMany
  @JoinTable(
      name = "anstd_persem",
      joinColumns = @JoinColumn(name = "id_perioada_semestru"),
      inverseJoinColumns = @JoinColumn(name = "id_an_studiu"))
  private Set<AnStudiu> anStudiuSet;

  @ManyToMany
  @JoinTable(
      name = "ciclustd_prgstd",
      joinColumns = @JoinColumn(name = "id_perioada_semestru"),
      inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu"))
  private Set<CicluStudiu> cicluStudiuSet;

  public PerioadaSemestru(
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

  public Set<AnStudiu> getAnStudiuSet() {
    return anStudiuSet;
  }

  public void setAnStudiuSet(Set<AnStudiu> anStudiuSet) {
    this.anStudiuSet = anStudiuSet;
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

  public Set<CicluStudiu> getCicluStudiuSet() {
    return cicluStudiuSet;
  }

  public void setCicluStudiuSet(Set<CicluStudiu> cicluStudiuSet) {
    this.cicluStudiuSet = cicluStudiuSet;
  }

  @Override
  public String toString() {
    return "PerioadaSemestru{" +
            "id_perioada_semestru=" + id_perioada_semestru +
            ", numar_semestru=" + numar_semestru +
            ", data_inceput='" + data_inceput + '\'' +
            ", data_sfarsit='" + data_sfarsit + '\'' +
            ", anStudiuSet=" + anStudiuSet +
            ", cicluStudiuSet=" + cicluStudiuSet +
            '}';
  }
}
