package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "programe_studiu")
public class ProgramaStudiu {

    private int id_prg_studiu;
    private int id_ciclu_studiu;
    private String detaliu;

    public ProgramaStudiu(){

    }

    public ProgramaStudiu(int id_prg_studiu, int id_ciclu_studiu, String detaliu) {
        this.id_prg_studiu = id_prg_studiu;
        this.id_ciclu_studiu = id_ciclu_studiu;
        this.detaliu = detaliu;
    }

    public int getId_prg_studiu() {
        return id_prg_studiu;
    }

    public void setId_prg_studiu(int id_prg_studiu) {
        this.id_prg_studiu = id_prg_studiu;
    }

    public int getId_ciclu_studiu() {
        return id_ciclu_studiu;
    }

    public void setId_ciclu_studiu(int id_ciclu_studiu) {
        this.id_ciclu_studiu = id_ciclu_studiu;
    }

    public String getDetaliu() {
        return detaliu;
    }

    public void setDetaliu(String detaliu) {
        this.detaliu = detaliu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramaStudiu that = (ProgramaStudiu) o;
        return id_prg_studiu == that.id_prg_studiu &&
                id_ciclu_studiu == that.id_ciclu_studiu &&
                detaliu.equals(that.detaliu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_prg_studiu, id_ciclu_studiu, detaliu);
    }
}
