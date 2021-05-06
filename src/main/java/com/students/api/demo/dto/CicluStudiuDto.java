package com.students.api.demo.dto;

import com.students.api.demo.entity.AnStudiu;
import com.students.api.demo.entity.PerioadaSemestru;

import java.util.Objects;
import java.util.Set;

public class CicluStudiuDto {

    private int id_ciclu_studiu;
    private String tip_ciclu_studiu;
    private Set<AnStudiu> anstudiu_ciclustd;
    private Set<PerioadaSemestru> perioadaSemestruSet;

    public CicluStudiuDto(){}

    public CicluStudiuDto(int id_ciclu_studiu, String tip_ciclu_studiu, Set<AnStudiu> anstudiu_ciclustd, Set<PerioadaSemestru> perioadaSemestruSet) {
        this.id_ciclu_studiu = id_ciclu_studiu;
        this.tip_ciclu_studiu = tip_ciclu_studiu;
        this.anstudiu_ciclustd = anstudiu_ciclustd;
        this.perioadaSemestruSet = perioadaSemestruSet;
    }

    public int getId_ciclu_studiu() {
        return id_ciclu_studiu;
    }

    public void setId_ciclu_studiu(int id_ciclu_studiu) {
        this.id_ciclu_studiu = id_ciclu_studiu;
    }

    public String getTip_ciclu_studiu() {
        return tip_ciclu_studiu;
    }

    public void setTip_ciclu_studiu(String tip_ciclu_studiu) {
        this.tip_ciclu_studiu = tip_ciclu_studiu;
    }

    public Set<AnStudiu> getAnstudiu_ciclustd() {
        return anstudiu_ciclustd;
    }

    public void setAnstudiu_ciclustd(Set<AnStudiu> anstudiu_ciclustd) {
        this.anstudiu_ciclustd = anstudiu_ciclustd;
    }

    public Set<PerioadaSemestru> getPerioadaSemestruSet() {
        return perioadaSemestruSet;
    }

    public void setPerioadaSemestruSet(Set<PerioadaSemestru> perioadaSemestruSet) {
        this.perioadaSemestruSet = perioadaSemestruSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CicluStudiuDto that = (CicluStudiuDto) o;
        return id_ciclu_studiu == that.id_ciclu_studiu &&
                tip_ciclu_studiu.equals(that.tip_ciclu_studiu) &&
                anstudiu_ciclustd.equals(that.anstudiu_ciclustd) &&
                perioadaSemestruSet.equals(that.perioadaSemestruSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ciclu_studiu, tip_ciclu_studiu, anstudiu_ciclustd, perioadaSemestruSet);
    }
}
