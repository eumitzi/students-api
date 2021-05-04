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

    @OneToOne(mappedBy = "persoana_prof")
    private Profesor profesor;

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
}


