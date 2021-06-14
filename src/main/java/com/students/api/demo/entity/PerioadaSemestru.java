package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "perioada_semestru")
public class PerioadaSemestru {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_perioada_sem")
  private int id;
  @Column(name = "numar_semestru")
  private int numarSemestru;
  @Column(name = "data_inceput")
  private String dataInceput;
  @Column(name = "data_sfarsit")
  private String dataSfarsit;
  @ManyToOne
  @JoinColumn(name = "id_an_studiu", referencedColumnName = "id_an_studiu")
  private AnStudiu anStudiu;

  // getters, setters, allArgsConstructor, noArgsConstructor

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNumarSemestru() {
    return numarSemestru;
  }

  public void setNumarSemestru(int numarSemestru) {
    this.numarSemestru = numarSemestru;
  }

  public String getDataInceput() {
    return dataInceput;
  }

  public void setDataInceput(String dataInceput) {
    this.dataInceput = dataInceput;
  }

  public String getDataSfarsit() {
    return dataSfarsit;
  }

  public void setDataSfarsit(String dataSfarsit) {
    this.dataSfarsit = dataSfarsit;
  }

  public AnStudiu getAnStudiu() {
    return anStudiu;
  }

  public void setAnStudiu(AnStudiu anStudiu) {
    this.anStudiu = anStudiu;
  }
}
