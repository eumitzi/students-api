package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tip_persoane")
public class TipPersoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_tip_persoane")
  private int id;

  @Column(name = "tip_persoane")
  private String tip;

  public int getId() {
    return id;
  }

  public void setId(int id_tip_persoane) {
    this.id = id_tip_persoane;
  }

  public String getTip() {
    return tip;
  }

  public void setTip(String tip_persoane) {
    this.tip = tip_persoane;
  }
}
