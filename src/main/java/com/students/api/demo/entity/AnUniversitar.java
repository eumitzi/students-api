package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "an_universitar")
public class AnUniversitar {

  @Id
  @Column(name = "id_an_universitar")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_an_universitar;

  @Column(name = "an_universitar")
  private int an_universitar;

  @Column(name = "tip_an_universitar")
  private String tip_an_universitar;

  @OneToOne(mappedBy = "anUniversitar")
  private InstantaDisciplina instantaDisciplina;

  @ManyToOne
  @JoinColumn(name = "id_an_universitar", nullable = false)
  private AnStudiu anStudiu;

  public AnUniversitar(int id_an_universitar, int an_universitar, String tip_an_universitar) {
    this.id_an_universitar = id_an_universitar;
    this.an_universitar = an_universitar;
    this.tip_an_universitar = tip_an_universitar;
  }

  public AnUniversitar() {}

  public int getId_an_universitar() {
    return id_an_universitar;
  }

  public void setId_an_universitar(int id_an_universitar) {
    this.id_an_universitar = id_an_universitar;
  }

  public int getAn_universitar() {
    return an_universitar;
  }

  public void setAn_universitar(int an_universitar) {
    this.an_universitar = an_universitar;
  }

  public String getTip_an_universitar() {
    return tip_an_universitar;
  }

  public void setTip_an_universitar(String tip_an_universitar) {
    this.tip_an_universitar = tip_an_universitar;
  }

  public InstantaDisciplina getInstantaDisciplina() {
    return instantaDisciplina;
  }

  public void setInstantaDisciplina(InstantaDisciplina instantaDisciplina) {
    this.instantaDisciplina = instantaDisciplina;
  }

  public AnStudiu getAnStudiu() {
    return anStudiu;
  }

  public void setAnStudiu(AnStudiu anStudiu) {
    this.anStudiu = anStudiu;
  }
}
