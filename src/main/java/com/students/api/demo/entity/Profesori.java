package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profesori")
public class Profesori {
    private int id_profesori;
    private int id_persoana;

    public Profesori(int id_profesori, int id_persoana) {
        this.id_profesori = id_profesori;
        this.id_persoana = id_persoana;
    }

    public int getId_profesori() {
        return id_profesori;
    }

    public void setId_profesori(int id_profesori) {
        this.id_profesori = id_profesori;
    }

    public int getId_persoana() {
        return id_persoana;
    }

    public void setId_persoana(int id_persoana) {
        this.id_persoana = id_persoana;
    }
}
