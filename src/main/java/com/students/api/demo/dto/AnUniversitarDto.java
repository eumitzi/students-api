package com.students.api.demo.dto;

import com.students.api.demo.entity.AnStudiu;
import com.students.api.demo.entity.InstantaDisciplina;
import java.util.Objects;


public class AnUniversitarDto {

    private int id_an_universitar;
    private int an_universitar;
    private String tip_an_universitar;
    private InstantaDisciplina instantaDisciplina;
    private AnStudiu anStudiu;

    public AnUniversitarDto(){}

    public AnUniversitarDto(int id_an_universitar, int an_universitar, String tip_an_universitar, InstantaDisciplina instantaDisciplina, AnStudiu anStudiu) {
        this.id_an_universitar = id_an_universitar;
        this.an_universitar = an_universitar;
        this.tip_an_universitar = tip_an_universitar;
        this.instantaDisciplina = instantaDisciplina;
        this.anStudiu = anStudiu;
    }

    public int getId_an_universitar() {
        return id_an_universitar;
    }

    public void setId_an_universitar(int id_an_universitar) {
        this.id_an_universitar = id_an_universitar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnUniversitarDto that = (AnUniversitarDto) o;
        return id_an_universitar == that.id_an_universitar &&
                an_universitar == that.an_universitar &&
                tip_an_universitar.equals(that.tip_an_universitar) &&
                instantaDisciplina.equals(that.instantaDisciplina) &&
                anStudiu.equals(that.anStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_an_universitar, an_universitar, tip_an_universitar, instantaDisciplina, anStudiu);
    }
}
