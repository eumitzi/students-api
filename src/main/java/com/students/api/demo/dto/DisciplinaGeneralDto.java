package com.students.api.demo.dto;

import com.students.api.demo.entity.InstantaDisciplina;
import java.util.Objects;
import java.util.Set;


public class DisciplinaGeneralDto {

    private int id_disciplina;
    private String nume;
    private Set<InstantaDisciplina> instanta_disciplina;

    public DisciplinaGeneralDto(){}

    public DisciplinaGeneralDto(int id_disciplina, String nume, Set<InstantaDisciplina> instanta_disciplina) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplinaGeneralDto that = (DisciplinaGeneralDto) o;
        return id_disciplina == that.id_disciplina &&
                nume.equals(that.nume) &&
                instanta_disciplina.equals(that.instanta_disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_disciplina, nume, instanta_disciplina);
    }
}
