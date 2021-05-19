package com.students.api.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "an_studiu")
public class AnStudiu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_an_studiu")
  private int id;

  @Column(name = "an_studiu")
  private int anStudiu;

  @Column(name = "data_inceput")
  private String dataInceput;

  @Column(name = "data_sfarsit")
  private String dataSfarsit;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_an_universitar", referencedColumnName = "id_an_universitar")
  private AnUniversitar anUniversitar;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "id_ciclu_studiu", referencedColumnName = "id_ciclu_studiu")
  private CicluStudiu cicluStudiu;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAnStudiu() {
    return anStudiu;
  }

  public void setAnStudiu(int anStudiu) {
    this.anStudiu = anStudiu;
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

  public AnUniversitar getAnUniversitar() {
    return anUniversitar;
  }

  public void setAnUniversitar(AnUniversitar anUniversitar) {
    this.anUniversitar = anUniversitar;
  }

  public CicluStudiu getCicluStudiu() {
    return cicluStudiu;
  }

  public void setCicluStudiu(CicluStudiu cicluStudiu) {
    this.cicluStudiu = cicluStudiu;
  }
}
