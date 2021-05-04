package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

  @OneToMany(
      mappedBy = "profesor",
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  private List<InstantaDisciplina> instantaDisciplinaList;

  public Profesor(
      int id_profesori, Persoane persoana_prof, List<InstantaDisciplina> instantaDisciplinaList) {
    this.id_profesori = id_profesori;
    this.persoana_prof = persoana_prof;
    this.instantaDisciplinaList = instantaDisciplinaList;
  }

  public Persoane getPersoana_prof() {
    return persoana_prof;
  }

  public void setPersoana_prof(Persoane persoana_prof) {
    this.persoana_prof = persoana_prof;
  }

  public void add(InstantaDisciplina instantaDisciplina) {
    if (instantaDisciplinaList == null) {
      instantaDisciplinaList = new ArrayList<InstantaDisciplina>();
    }
    instantaDisciplinaList.add(instantaDisciplina);
    instantaDisciplina.setProfesor(this);
  }

  public int getId_profesori() {
    return id_profesori;
  }

  public void setId_profesori(int id_profesori) {
    this.id_profesori = id_profesori;
  }

  public List<InstantaDisciplina> getInstantaDisciplinaList() {
    return instantaDisciplinaList;
  }

  public void setInstantaDisciplinaList(List<InstantaDisciplina> instantaDisciplinaList) {
    this.instantaDisciplinaList = instantaDisciplinaList;
  }
}
