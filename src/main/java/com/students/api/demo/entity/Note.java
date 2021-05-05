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

    public Note(){}

    public Note(int id_nota, String tip_nota, Set<NoteActivitate> note_activitate, Set<NoteExamen> note_examen, Set<NoteFinale> note_finale) {
        this.id_nota = id_nota;
        this.tip_nota = tip_nota;
        this.note_activitate = note_activitate;
        this.note_examen = note_examen;
        this.note_finale = note_finale;
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

    public Set<NoteActivitate> getNote_activitate() {
        return note_activitate;
    }

    public void setNote_activitate(Set<NoteActivitate> note_activitate) {
        this.note_activitate = note_activitate;
    }

    public Set<NoteExamen> getNote_examen() {
        return note_examen;
    }

    public void setNote_examen(Set<NoteExamen> note_examen) {
        this.note_examen = note_examen;
    }

    public Set<NoteFinale> getNote_finale() {
        return note_finale;
    }

    public void setNote_finale(Set<NoteFinale> note_finale) {
        this.note_finale = note_finale;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id_nota=" + id_nota +
                ", tip_nota='" + tip_nota + '\'' +
                ", note_activitate=" + note_activitate +
                ", note_examen=" + note_examen +
                ", note_finale=" + note_finale +
                '}';
    }
}
