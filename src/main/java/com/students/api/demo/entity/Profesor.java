package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profesori")
public class Profesor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_profesori")
  private int id_profesori;

  @OneToOne
  @JoinColumn(name = "id_persoana", referencedColumnName = "id_persoana")
  private Persoane persoana_prof;


//  @ManyToMany
//  @JoinTable(
//          name = "prof_instdisc",
//          joinColumns = @JoinColumn(name = "id_profesor"),
//          inverseJoinColumns = @JoinColumn(name = "id_instanta_disciplina"))
//  private Set<InstantaDisciplina> instantaDisciplinaSet;


  public Profesor(){

  }

  public Profesor(int id_profesori, Persoane persoana_prof, Set<InstantaDisciplina> instantaDisciplinaSet) {
    this.id_profesori = id_profesori;
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
    return "Profesor{" +
            "id_profesori=" + id_profesori +
            ", persoana_prof=" + persoana_prof +
            '}';
  }

  public int getId_profesori() {
    return id_profesori;
  }

  public void setId_profesori(int id_profesori) {
    this.id_profesori = id_profesori;
  }

}
