package com.students.api.demo.dto;

import com.students.api.demo.entity.AnUniversitar;
import com.students.api.demo.entity.CicluStudiu;
import com.students.api.demo.entity.PerioadaSemestru;

import java.util.Objects;
import java.util.Set;

public class AnStudiuDto {
    private int id_an_studiu;
    private int an_studiu;
    private String data_inceput;
    private String data_sfarsit;
    private Set<AnUniversitar> anUniversitarSet;
    private Set<PerioadaSemestru> perioadaSemestruSet;
    private Set<CicluStudiu> ciclustd_anstudiu;

    public AnStudiuDto(){}

    public AnStudiuDto(int id_an_studiu, int an_studiu, String data_inceput, String data_sfarsit, Set<AnUniversitar> anUniversitarSet, Set<PerioadaSemestru> perioadaSemestruSet, Set<CicluStudiu> ciclustd_anstudiu) {
        this.id_an_studiu = id_an_studiu;
        this.an_studiu = an_studiu;
        this.data_inceput = data_inceput;
        this.data_sfarsit = data_sfarsit;
        this.anUniversitarSet = anUniversitarSet;
        this.perioadaSemestruSet = perioadaSemestruSet;
        this.ciclustd_anstudiu = ciclustd_anstudiu;
    }

    public int getId_an_studiu() {
        return id_an_studiu;
    }

    public void setId_an_studiu(int id_an_studiu) {
        this.id_an_studiu = id_an_studiu;
    }

    public int getAn_studiu() {
        return an_studiu;
    }

    public void setAn_studiu(int an_studiu) {
        this.an_studiu = an_studiu;
    }

    public String getData_inceput() {
        return data_inceput;
    }

    public void setData_inceput(String data_inceput) {
        this.data_inceput = data_inceput;
    }

    public String getData_sfarsit() {
        return data_sfarsit;
    }

    public void setData_sfarsit(String data_sfarsit) {
        this.data_sfarsit = data_sfarsit;
    }

    public Set<AnUniversitar> getAnUniversitarSet() {
        return anUniversitarSet;
    }

    public void setAnUniversitarSet(Set<AnUniversitar> anUniversitarSet) {
        this.anUniversitarSet = anUniversitarSet;
    }

    public Set<PerioadaSemestru> getPerioadaSemestruSet() {
        return perioadaSemestruSet;
    }

    public void setPerioadaSemestruSet(Set<PerioadaSemestru> perioadaSemestruSet) {
        this.perioadaSemestruSet = perioadaSemestruSet;
    }

    public Set<CicluStudiu> getCiclustd_anstudiu() {
        return ciclustd_anstudiu;
    }

    public void setCiclustd_anstudiu(Set<CicluStudiu> ciclustd_anstudiu) {
        this.ciclustd_anstudiu = ciclustd_anstudiu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnStudiuDto that = (AnStudiuDto) o;
        return id_an_studiu == that.id_an_studiu &&
                an_studiu == that.an_studiu &&
                data_inceput.equals(that.data_inceput) &&
                data_sfarsit.equals(that.data_sfarsit) &&
                anUniversitarSet.equals(that.anUniversitarSet) &&
                perioadaSemestruSet.equals(that.perioadaSemestruSet) &&
                ciclustd_anstudiu.equals(that.ciclustd_anstudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_an_studiu, an_studiu, data_inceput, data_sfarsit, anUniversitarSet, perioadaSemestruSet, ciclustd_anstudiu);
    }
}
