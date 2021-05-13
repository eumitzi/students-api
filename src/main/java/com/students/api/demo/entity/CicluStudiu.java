package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {
  @Id
  @Column(name = "id_ciclu_studiu")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(name = "tip_ciclu_studiu")
  private String tip_ciclu_studiu;
  @ManyToMany(mappedBy = "cicluStudiuSet")
  private Set<AnStudiu> anStudiuSet;
  @ManyToMany
  @JoinTable(
      name = "ciclustd_prgstd",
      joinColumns = @JoinColumn(name = "id_ciclu_studiu"),
      inverseJoinColumns = @JoinColumn(name = "id_programe_studiu"))
  private Set<ProgramaStudiu> programaStudiuSet;

  public CicluStudiu(
      int id,
      String tip_ciclu_studiu,
      Set<AnStudiu> anStudiuSet,
      Set<ProgramaStudiu> programaStudiuSet) {
    this.id = id;
    this.tip_ciclu_studiu = tip_ciclu_studiu;
    this.anStudiuSet = anStudiuSet;
    this.programaStudiuSet = programaStudiuSet;
  }

  public CicluStudiu() {}

  public Set<ProgramaStudiu> getProgramaStudiuSet() {
    return programaStudiuSet;
  }

  public void setProgramaStudiuSet(Set<ProgramaStudiu> programaStudiuSet) {
    this.programaStudiuSet = programaStudiuSet;
  }

  @Override
  public String toString() {
    return "CicluStudiu{"
        + "id_ciclu_studiu="
        + id
        + ", tip_ciclu_studiu='"
        + tip_ciclu_studiu
        + '\''
        + ", anStudiuSet="
        + anStudiuSet
        + ", programaStudiuSet="
        + programaStudiuSet
        + '}';
  }

  public String getTip_ciclu_studiu() {
    return tip_ciclu_studiu;
  }

  public void setTip_ciclu_studiu(String tip_ciclu_studiu) {
    this.tip_ciclu_studiu = tip_ciclu_studiu;
  }

  public int getId() {
    return id;
  }

  public void setId(int id_ciclu_studiu) {
    this.id = id_ciclu_studiu;
  }

  public Set<AnStudiu> getAnStudiuSet() {
    return anStudiuSet;
  }

  public void setAnStudiuSet(Set<AnStudiu> anstudiu_ciclustd) {
    this.anStudiuSet = anstudiu_ciclustd;
  }
}
