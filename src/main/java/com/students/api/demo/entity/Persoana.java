package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "persoane")
public class Persoana {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_persoana")
  private int id;

  @Column(name = "nume_persoana")
  private String nume;

  @Column(name = "prenume_persoana")
  private String prenume;

  @Column(name = "adresa")
  private String adresa;

  @ManyToOne
  @JoinColumn(name = "id_tip_persoana", referencedColumnName = "id_tip_persoane")
  private TipPersoana tipPersoana;

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

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public String getAdresa() {
    return adresa;
  }

  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }

  public TipPersoana getTipPersoana() {
    return tipPersoana;
  }

  public void setTipPersoana(TipPersoana tipPersoana) {
    this.tipPersoana = tipPersoana;
  }
}
