package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "perioada_semestru")
public class PerioadaSemestru {

  @Id
  @Column(name = "id_perioada_sem")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "numar_semestru")
  private int numar_semestru;

  @Column(name = "data_inceput")
  private String data_inceput;

  @Override
  public String toString() {
    return "PerioadaSemestru{" +
            "id=" + id +
            ", numar_semestru=" + numar_semestru +
            ", data_inceput='" + data_inceput + '\'' +
            ", data_sfarsit='" + data_sfarsit + '\'' +
            ", anStudiuSet=" + anStudiuSet +
            '}';
  }

  @Column(name = "data_sfarsit")
  private String data_sfarsit;

  public PerioadaSemestru(){

  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public PerioadaSemestru(
      int id,
      int numar_semestru,
      String data_inceput,
      String data_sfarsit,
      Set<AnStudiu> anStudiuSet) {
    this.id = id;
    this.numar_semestru = numar_semestru;
    this.data_inceput = data_inceput;
    this.data_sfarsit = data_sfarsit;
    this.anStudiuSet = anStudiuSet;
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

  @ManyToMany(mappedBy = "perioadaSemestruSet")
  private Set<AnStudiu> anStudiuSet = new HashSet<AnStudiu>();
}
