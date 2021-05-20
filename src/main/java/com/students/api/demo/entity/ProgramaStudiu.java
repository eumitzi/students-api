package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "programe_studiu")
public class ProgramaStudiu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_programe_studiu")
  private int id;

  @Column(name = "detaliu_program_studiu")
  private String detaliu;

  @ManyToOne
  @JoinColumn(name = "id_ciclu_studiu", referencedColumnName = "id_ciclu_studiu")
  private CicluStudiu cicluStudiu;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDetaliu() {
    return detaliu;
  }

  public void setDetaliu(String detaliu) {
    this.detaliu = detaliu;
  }

  public CicluStudiu getCicluStudiu() {
    return cicluStudiu;
  }

  public void setCicluStudiu(CicluStudiu cicluStudiu) {
    this.cicluStudiu = cicluStudiu;
  }
}
