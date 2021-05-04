package com.students.api.demo.entity;

import org.hibernate.mapping.Join;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persoana")
public class Persoane {
    private int id_persoana;
    private int id_tip_persoana;
    private String nume;
    private String prenume;
    private String adresa;

    @OneToOne(mappedBy = "persoana_stud")
    private Student student;

    @OneToOne(mappedBy = "persoana_prof")
    private Profesor profesor;
    public int getId_persoana() {
        return id_persoana;
    }

    public void setId_persoana(int id_persoana) {
        this.id_persoana = id_persoana;
    }

    public int getId_tip_persoana() {
        return id_tip_persoana;
    }

    public void setId_tip_persoana(int id_tip_persoana) {
        this.id_tip_persoana = id_tip_persoana;
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
}


