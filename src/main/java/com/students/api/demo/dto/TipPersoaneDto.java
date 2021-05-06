package com.students.api.demo.dto;


import com.students.api.demo.entity.Persoane;

import java.util.Objects;
import java.util.Set;

public class TipPersoaneDto {

    private int id_tip_persoane;
    private String tip_persoane;
    private Set<Persoane> persoaneSet;

    public TipPersoaneDto(){}

    public TipPersoaneDto(int id_tip_persoane, String tip_persoane, Set<Persoane> persoaneSet) {
        this.id_tip_persoane = id_tip_persoane;
        this.tip_persoane = tip_persoane;
        this.persoaneSet = persoaneSet;
    }

    public int getId_tip_persoane() {
        return id_tip_persoane;
    }

    public void setId_tip_persoane(int id_tip_persoane) {
        this.id_tip_persoane = id_tip_persoane;
    }

    public String getTip_persoane() {
        return tip_persoane;
    }

    public void setTip_persoane(String tip_persoane) {
        this.tip_persoane = tip_persoane;
    }

    public Set<Persoane> getPersoaneSet() {
        return persoaneSet;
    }

    public void setPersoaneSet(Set<Persoane> persoaneSet) {
        this.persoaneSet = persoaneSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipPersoaneDto that = (TipPersoaneDto) o;
        return id_tip_persoane == that.id_tip_persoane &&
                tip_persoane.equals(that.tip_persoane) &&
                persoaneSet.equals(that.persoaneSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_tip_persoane, tip_persoane, persoaneSet);
    }
}
