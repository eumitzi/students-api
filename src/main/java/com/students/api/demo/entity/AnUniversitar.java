package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "an_universitar")
public class AnUniversitar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_an_universitar")
  private int id;

  @Column(name = "an_universitar")
  private int anUniversitar;

  @Column(name = "tip_an_universitar")
  private String tipAnUniversitar;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAnUniversitar() {
    return anUniversitar;
  }

  public void setAnUniversitar(int anUniversitar) {
    this.anUniversitar = anUniversitar;
  }

  public String getTipAnUniversitar() {
    return tipAnUniversitar;
  }

  public void setTipAnUniversitar(String tipAnUniversitar) {
    this.tipAnUniversitar = tipAnUniversitar;
  }
}
