package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profesori")
public class Profesor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_profesori")
  private int id;

  @OneToOne
  @JoinColumn(name = "id_persoana", referencedColumnName = "id_persoana")
  private Persoane persoana_prof;

  public Profesor() {}

  public Profesor(int id, Persoane persoana_prof, Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.id = id;
    this.persoana_prof = persoana_prof;
    //    this.instantaDisciplinaSet = instantaDisciplinaSet;
  }

  public Persoane getPersoana_prof() {
    return persoana_prof;
  }

  public void setPersoana_prof(Persoane persoana_prof) {
    this.persoana_prof = persoana_prof;
  }

  @Override
  public String toString() {
    return "Profesor{" + "id_profesori=" + id + ", persoana_prof=" + persoana_prof + '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id_profesori) {
    this.id = id_profesori;
  }
}
