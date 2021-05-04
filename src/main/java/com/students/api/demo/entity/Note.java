package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota;

    @Column(name = "tip_nota")
    private String tip_nota;

    @OneToMany(mappedBy = "note_noteAc")
    private Set<NoteActivitate> note_activitate;

    @OneToMany(mappedBy = "note_noteEx")
    private Set<NoteExamen> note_examen;

    @OneToMany(mappedBy = "note_noteFin")
    private Set<NoteFinale> note_finale;


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
}
