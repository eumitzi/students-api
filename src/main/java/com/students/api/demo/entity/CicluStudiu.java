package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_ciclu_studiu")
  private int id;

  @Column(name = "tip_ciclu_studiu")
  private String tipCicluStudiu;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTipCicluStudiu() {
    return tipCicluStudiu;
  }

  public void setTipCicluStudiu(String tipCicluStudiu) {
    this.tipCicluStudiu = tipCicluStudiu;
  }
}
