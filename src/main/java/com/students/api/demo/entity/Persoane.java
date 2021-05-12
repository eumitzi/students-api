package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "persoane")
public class Persoane {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_persoana")
  private int id;

  @Column(name = "nume_persoana")
  private String nume;

  @Column(name = "prenume_persoana")
  private String prenume;

  @Column(name = "adresa")
  private String adresa;

  @ManyToOne
  @JoinColumn(name = "id_tip_persoana", nullable = false)
  private TipPersoane tipPersoane;

  public Persoane(){

  }

  public int getId() {
    return id;
  }

  public void setId(int id_persoana) {
    this.id = id_persoana;
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
  public TipPersoane getTipPersoane() {
    return tipPersoane;
  }

  public void setTipPersoane(TipPersoane tipPersoane) {
    this.tipPersoane = tipPersoane;
  }

  @Override
  public String toString() {
    return "Persoane{" +
            "id_persoana=" + id +
            ", nume='" + nume + '\'' +
            ", prenume='" + prenume + '\'' +
            ", adresa='" + adresa + '\'' +
            ", tipPersoane=" + tipPersoane +
            '}';
  }
}
