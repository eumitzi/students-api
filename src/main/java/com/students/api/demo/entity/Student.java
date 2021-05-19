package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "studenti")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_student")
  private int id;

  @Column(name = "nr_matricol")
  private String nrMatricol;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name= "id_persoana", referencedColumnName = "id_persoana")
  private Persoana persoana;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNrMatricol() {
    return nrMatricol;
  }

  public void setNrMatricol(String nrMatricol) {
    this.nrMatricol = nrMatricol;
  }

  public Persoana getPersoana() {
    return persoana;
  }

  public void setPersoana(Persoana persoana) {
    this.persoana = persoana;
  }
}
