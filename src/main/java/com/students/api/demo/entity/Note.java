package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_nota")
    private int id;

    @Column(name = "tip_nota")
    private String tip_nota;

    public Note(){}

    public Note(int id, String tip_nota) {
        this.id = id;
        this.tip_nota = tip_nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_nota) {
        this.id = id_nota;
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
                "id_nota=" + id +
                ", tip_nota='" + tip_nota + '\'' +
                '}';
    }
}
