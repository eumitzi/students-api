package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "persoane")
public class Persoane {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_persoana;

  @Column(name = "nume_persoane")
  private String nume;

  @Column(name = "prenume_persoana")
  private String prenume;

  @Column(name = "adresa")
  private String adresa;

  @OneToOne(mappedBy = "persoana_stud")
  private Student student;

  @OneToOne(mappedBy = "persoana_stud")
  private Student student;

  @OneToOne(mappedBy = "persoana_prof")
  private Profesor profesor;

  @OneToOne(mappedBy = "persoana_prof")
  private Profesor profesor;

  @ManyToOne
  @JoinColumn(name = "id_tip_persoane", nullable = false)
  private TipPersoane tipPersoane;

  public Persoane(){

  }

  public Persoane(int id_persoana, String nume, String prenume, String adresa, Student student, Student student1, Profesor profesor, Profesor profesor1, TipPersoane tipPersoane) {
    this.id_persoana = id_persoana;
    this.nume = nume;
    this.prenume = prenume;
    this.adresa = adresa;
    this.student = student;
    this.student = student1;
    this.profesor = profesor;
    this.profesor = profesor1;
    this.tipPersoane = tipPersoane;
  }

  public int getId_persoana() {
    return id_persoana;
  }

  public void setId_persoana(int id_persoana) {
    this.id_persoana = id_persoana;
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

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
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
            "id_persoana=" + id_persoana +
            ", nume='" + nume + '\'' +
            ", prenume='" + prenume + '\'' +
            ", adresa='" + adresa + '\'' +
            ", student=" + student +
            ", student=" + student +
            ", profesor=" + profesor +
            ", profesor=" + profesor +
            ", tipPersoane=" + tipPersoane +
            '}';
  }
}
