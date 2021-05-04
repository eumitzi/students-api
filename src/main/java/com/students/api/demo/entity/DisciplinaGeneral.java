package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "discipline_general")
public class DisciplinaGeneral {

    @Id
    @Column(name = "id_disciplina")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_disciplina;

    @Column(name = "nume")
    private String nume;

    @OneToMany(mappedBy = "disciplina_general")
    private Set<InstantaDisciplina> instanta_disciplina;

    public DisciplinaGeneral(){}


    public DisciplinaGeneral(int id_disciplina, String nume, Set<InstantaDisciplina> instanta_disciplina) {
        this.id_disciplina = id_disciplina;
        this.nume = nume;
        this.instanta_disciplina = instanta_disciplina;
    }


    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Set<InstantaDisciplina> getInstanta_disciplina() {
        return instanta_disciplina;
    }

    public void setInstanta_disciplina(Set<InstantaDisciplina> instanta_disciplina) {
        this.instanta_disciplina = instanta_disciplina;
    }

    @Override
    public String toString() {
        return "DisciplinaGeneral{" +
                "id_disciplina=" + id_disciplina +
                ", nume='" + nume + '\'' +
                ", instanta_disciplina=" + instanta_disciplina +
                '}';
    }
}
