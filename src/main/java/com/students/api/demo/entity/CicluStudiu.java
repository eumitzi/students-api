package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {

  private String tip_ciclu_studiu;
  private int id_ciclu_studiu;

    @ManyToMany
    @JoinTable(name="anstd_ciclustd",
            joinColumns = @JoinColumn(name="id_an_studiu"),
            inverseJoinColumns = @JoinColumn(name ="id_ciclu_studiu"))
    Set<AnStudiu> anstudiu_ciclustd;

    public CicluStudiu(String tip_ciclu_studiu, int id_ciclu_studiu) {
        this.tip_ciclu_studiu = tip_ciclu_studiu;
        this.id_ciclu_studiu = id_ciclu_studiu;
    }

    public CicluStudiu() {

    }
  @ManyToMany
  @JoinTable(
      name = "ciclustd_prgstd",
      joinColumns = @JoinColumn(name = "id_ciclu_studiu"),
      inverseJoinColumns = @JoinColumn(name = "id_perioada_semestru"))
  private Set<PerioadaSemestru> perioadaSemestruSet;

  public CicluStudiu() {}

  public CicluStudiu(
      String tip_ciclu_studiu, int id_ciclu_studiu, Set<PerioadaSemestru> perioadaSemestruSet) {
    this.tip_ciclu_studiu = tip_ciclu_studiu;
    this.id_ciclu_studiu = id_ciclu_studiu;
    this.perioadaSemestruSet = perioadaSemestruSet;
  }

  public String getTip_ciclu_studiu() {
    return tip_ciclu_studiu;
  }

  public void setTip_ciclu_studiu(String tip_ciclu_studiu) {
    this.tip_ciclu_studiu = tip_ciclu_studiu;
  }

  public int getId_ciclu_studiu() {
    return id_ciclu_studiu;
  }

  public void setId_ciclu_studiu(int id_ciclu_studiu) {
    this.id_ciclu_studiu = id_ciclu_studiu;
  }

  @Override
  public String toString() {
    return "CicluStudiu{" +
            "tip_ciclu_studiu='" + tip_ciclu_studiu + '\'' +
            ", id_ciclu_studiu=" + id_ciclu_studiu +
            ", perioadaSemestruSet=" + perioadaSemestruSet +
            '}';
  }
}
