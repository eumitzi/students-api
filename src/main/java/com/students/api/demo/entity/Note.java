package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_nota")
    private int id_nota;

    @Column(name = "tip_nota")
    private String tip_nota;

    public Note(){}

    public Note(int id_nota, String tip_nota) {
        this.id_nota = id_nota;
        this.tip_nota = tip_nota;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public String getTip_nota() {
        return tip_nota;
    }

    public void setTip_nota(String tip_nota) {
        this.tip_nota = tip_nota;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id_nota=" + id_nota +
                ", tip_nota='" + tip_nota + '\'' +
                '}';
    }
}
