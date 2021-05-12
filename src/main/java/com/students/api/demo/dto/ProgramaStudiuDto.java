package com.students.api.demo.dto;

import com.students.api.demo.entity.CicluStudiu;

import java.util.Objects;
import java.util.Set;

public class ProgramaStudiuDto {

    private int id_prg_studiu;
    private String detaliu;
    private Set<CicluStudiu> cicluStudiuSet;

    public ProgramaStudiuDto(){

    }

    public ProgramaStudiuDto(int id_prg_studiu, String detaliu, Set<CicluStudiu> cicluStudiuSet) {
        this.id_prg_studiu = id_prg_studiu;
        this.detaliu = detaliu;
        this.cicluStudiuSet = cicluStudiuSet;
    }

    public int getId_prg_studiu() {
        return id_prg_studiu;
    }

    public void setId_prg_studiu(int id_prg_studiu) {
        this.id_prg_studiu = id_prg_studiu;
    }

    public String getDetaliu() {
        return detaliu;
    }

    public void setDetaliu(String detaliu) {
        this.detaliu = detaliu;
    }

    public Set<CicluStudiu> getCicluStudiuSet() {
        return cicluStudiuSet;
    }

    public void setCicluStudiuSet(Set<CicluStudiu> cicluStudiuSet) {
        this.cicluStudiuSet = cicluStudiuSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramaStudiuDto that = (ProgramaStudiuDto) o;
        return id_prg_studiu == that.id_prg_studiu &&
                detaliu.equals(that.detaliu) &&
                cicluStudiuSet.equals(that.cicluStudiuSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_prg_studiu, detaliu, cicluStudiuSet);
    }
}
