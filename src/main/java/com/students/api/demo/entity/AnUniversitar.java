package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "an_universitar")
public class AnUniversitar {

  public AnUniversitar(
      int id, int an_universitar, String tip_an_universitar, Set<AnStudiu> anStudiuSet) {
    this.id = id;
    this.an_universitar = an_universitar;
    this.tip_an_universitar = tip_an_universitar;
  }

  @Id
  @Column(name = "id_an_universitar")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "an_universitar")
  private int an_universitar;

  @Column(name = "tip_an_universitar")
  private String tip_an_universitar;

  public AnUniversitar() {}

  public int getId() {
    return id;
  }

  public void setId(int id_an_universitar) {
    this.id = id_an_universitar;
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

  @Override
  public String toString() {
    return "AnUniversitar{"
        + "id_an_universitar="
        + id
        + ", an_universitar="
        + an_universitar
        + ", tip_an_universitar='"
        + tip_an_universitar
        + +'}';
  }
}
