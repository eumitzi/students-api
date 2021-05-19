package com.students.api.demo.dto;

import com.students.api.demo.entity.Profesor;
import com.students.api.demo.entity.Student;
import com.students.api.demo.entity.TipPersoana;

import java.util.Objects;

public class PersoaneDto {

  private int id_persoana;
  private String nume;
  private String prenume;
  private String adresa;
  private Student student;
  private Profesor profesor;
  private TipPersoana tipPersoana;

  public PersoaneDto(
      int id_persoana,
      String nume,
      String prenume,
      String adresa,
      Student student,
      Profesor profesor,
      TipPersoana tipPersoana) {
    this.id_persoana = id_persoana;
    this.nume = nume;
    this.prenume = prenume;
    this.adresa = adresa;
    this.student = student;
    this.profesor = profesor;
    this.tipPersoana = tipPersoana;
  }

  public PersoaneDto() {}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersoaneDto that = (PersoaneDto) o;
    return id_persoana == that.id_persoana
        && nume.equals(that.nume)
        && prenume.equals(that.prenume)
        && adresa.equals(that.adresa)
        && student.equals(that.student)
        && profesor.equals(that.profesor)
        && tipPersoana.equals(that.tipPersoana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id_persoana, nume, prenume, adresa, student, profesor, tipPersoana);
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

  public TipPersoana getTipPersoane() {
    return tipPersoana;
  }

  public void setTipPersoane(TipPersoana tipPersoana) {
    this.tipPersoana = tipPersoana;
  }
}
