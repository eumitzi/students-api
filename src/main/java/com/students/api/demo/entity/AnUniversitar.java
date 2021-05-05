package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

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

  public AnUniversitar(
      int id_an_universitar,
      int an_universitar,
      String tip_an_universitar,
      InstantaDisciplina instantaDisciplina,
      Set<AnStudiu> anStudiuSet) {
    this.id_an_universitar = id_an_universitar;
    this.an_universitar = an_universitar;
    this.tip_an_universitar = tip_an_universitar;
    this.instantaDisciplina = instantaDisciplina;
    this.anStudiuSet = anStudiuSet;
  }

  @OneToMany(mappedBy = "anUniversitar")
  private Set<AnStudiu> anStudiuSet;

  public Set<AnStudiu> getAnStudiuSet() {
    return anStudiuSet;
  }

  public void setAnStudiuSet(Set<AnStudiu> anStudiuSet) {
    this.anStudiuSet = anStudiuSet;
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

  @Override
  public String toString() {
    return "AnUniversitar{"
        + "id_an_universitar="
        + id_an_universitar
        + ", an_universitar="
        + an_universitar
        + ", tip_an_universitar='"
        + tip_an_universitar
        + '\''
        + ", instantaDisciplina="
        + instantaDisciplina
        + '}';
  }
}
