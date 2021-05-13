package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tip_persoane")
public class TipPersoane {

  @Id
  @Column(name = "id_tip_persoane")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "tip_persoane")
  private String tip_persoane;

  public TipPersoane() {}

  public TipPersoane(int id, String tip_persoane) {
    this.id = id;
    this.tip_persoane = tip_persoane;
  }

  public int getId() {
    return id;
  }

  public void setId(int id_tip_persoane) {
    this.id = id_tip_persoane;
  }

  public String getTip_persoane() {
    return tip_persoane;
  }

  public void setTip_persoane(String tip_persoane) {
    this.tip_persoane = tip_persoane;
  }

  @Override
  public String toString() {
    return "TipPersoane{" + "id_tip_persoane=" + id + ", tip_persoane='" + tip_persoane + '}';
  }
}
