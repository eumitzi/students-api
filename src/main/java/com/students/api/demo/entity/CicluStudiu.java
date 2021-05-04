package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {

    private String tip_ciclu_studiu;
    private int id_ciclu_studiu;

    public CicluStudiu(String tip_ciclu_studiu, int id_ciclu_studiu) {
        this.tip_ciclu_studiu = tip_ciclu_studiu;
        this.id_ciclu_studiu = id_ciclu_studiu;
    }

    public CicluStudiu() {

    }

    public String getTip_ciclu_studiu() {
        return tip_ciclu_studiu;
    }

    public void setTip_ciclu_studiu(String tip_ciclu_studiu) {
        this.tip_ciclu_studiu = tip_ciclu_studiu;
    }

    public int getId_ciclu_studiu() {
        return id_ciclu_studiu;
    }

    public void setId_ciclu_studiu(int id_ciclu_studiu) {
        this.id_ciclu_studiu = id_ciclu_studiu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CicluStudiu that = (CicluStudiu) o;
        return id_ciclu_studiu == that.id_ciclu_studiu &&
                tip_ciclu_studiu.equals(that.tip_ciclu_studiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tip_ciclu_studiu, id_ciclu_studiu);
    }
}
