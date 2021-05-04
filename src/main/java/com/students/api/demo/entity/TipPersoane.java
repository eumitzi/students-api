package com.students.api.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tip_persoane")
public class TipPersoane {
    private int id_tip_persoane;
    private String tip_persoane;

    public TipPersoane(int id_tip_persoane, String tip_persoane) {
        this.id_tip_persoane = id_tip_persoane;
        this.tip_persoane = tip_persoane;
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
}
