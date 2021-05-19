package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Nota {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nota")
  private int id;

  @Column(name = "tip_nota")
  private String tipNota;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipNota() {
    return tipNota;
  }

  public void setTipNota(String tipNota) {
    this.tipNota = tipNota;
  }
}
