package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "discipline_general")
public class DisciplinaGeneral {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_disciplina")
  private int id;

  @Column(name = "nume")
  private String nume;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }
}
