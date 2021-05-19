package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "profesori")
public class Profesor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_profesori")
  private int id;

  @OneToOne
  @JoinColumn(name= "id_persoana", referencedColumnName = "id_persoana")
  private Persoana persoana;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Persoana getPersoana() {
    return persoana;
  }

  public void setPersoana(Persoana persoana) {
    this.persoana = persoana;
  }
}
