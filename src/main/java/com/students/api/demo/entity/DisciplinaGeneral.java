package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "discipline_general")
public class DisciplinaGeneral {

  @Id
  @Column(name = "id_disciplina")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "nume")
  private String nume;

  public DisciplinaGeneral() {}

  public DisciplinaGeneral(int id_disciplina, String nume) {
    this.id = id_disciplina;
    this.nume = nume;
  }

  public int getId_disciplina() {
    return id;
  }

  public void setId_disciplina(int id_disciplina) {
    this.id = id_disciplina;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  @Override
  public String toString() {
    return "DisciplinaGeneral{" + "id_disciplina=" + id + ", nume='" + nume + '\'' + '}';
  }
}
