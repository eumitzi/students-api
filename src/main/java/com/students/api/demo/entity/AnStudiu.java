package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "an_studiu")
public class AnStudiu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_an_studiu;
    private int an_studiu;
    private String data_inceput;
    private String data_sfarsit;
    private int id_ciclu_studiu;
    private int id_an_universitar;

    @ManyToMany(mappedBy = "anstudiu_ciclustd")
    Set<CicluStudiu> ciclustd_anstudiu;

  @Id
  @Column(name = "id_an_studiu")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_an_studiu;

  @Column(name = "an_studiu")
  private int an_studiu;

  @Column(name = "data_inceput")
  private String data_inceput;

  @Column(name = "data_sfarsit")
  private String data_sfarsit;

  @OneToMany(mappedBy = "anStudiu")
  private Set<AnUniversitar> anUniversitarSet;

  @ManyToMany
  @JoinTable(
      name = "anstd_persem",
      joinColumns = @JoinColumn(name = "id_an_studiu"),
      inverseJoinColumns = @JoinColumn(name = "id_perioada_semestru"))
  private Set<PerioadaSemestru> perioadaSemestruSet;

  public AnStudiu() {}

  public AnStudiu(
      int id_an_studiu,
      int an_studiu,
      String data_inceput,
      String data_sfarsit,
      Set<AnUniversitar> anUniversitarSet,
      Set<PerioadaSemestru> perioadaSemestruSet) {
    this.id_an_studiu = id_an_studiu;
    this.an_studiu = an_studiu;
    this.data_inceput = data_inceput;
    this.data_sfarsit = data_sfarsit;
    this.anUniversitarSet = anUniversitarSet;
    this.perioadaSemestruSet = perioadaSemestruSet;
  }

  public int getId_an_studiu() {
    return id_an_studiu;
  }

  public void setId_an_studiu(int id_an_studiu) {
    this.id_an_studiu = id_an_studiu;
  }

  public int getAn_studiu() {
    return an_studiu;
  }

  public void setAn_studiu(int an_studiu) {
    this.an_studiu = an_studiu;
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

  public Set<AnUniversitar> getAnUniversitarSet() {
    return anUniversitarSet;
  }

  public void setAnUniversitarSet(Set<AnUniversitar> anUniversitarSet) {
    this.anUniversitarSet = anUniversitarSet;
  }

  @Override
  public String toString() {
    return "AnStudiu{"
        + "id_an_studiu="
        + id_an_studiu
        + ", an_studiu="
        + an_studiu
        + ", data_inceput='"
        + data_inceput
        + '\''
        + ", data_sfarsit='"
        + data_sfarsit
        + '\''
        + ", anUniversitarSet="
        + anUniversitarSet
        + '}';
  }

  public Set<PerioadaSemestru> getPerioadaSemestruSet() {
    return perioadaSemestruSet;
  }

  public void setPerioadaSemestruSet(Set<PerioadaSemestru> perioadaSemestruSet) {
    this.perioadaSemestruSet = perioadaSemestruSet;
  }
}
