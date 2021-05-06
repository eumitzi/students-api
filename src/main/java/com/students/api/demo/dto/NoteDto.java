package com.students.api.demo.dto;

import com.students.api.demo.entity.NoteActivitate;
import com.students.api.demo.entity.NoteExamen;
import com.students.api.demo.entity.NoteFinale;

import java.util.Objects;
import java.util.Set;


public class NoteDto {

    private int id_nota;
    private String tip_nota;
    private Set<NoteActivitate> note_activitate;
    private Set<NoteExamen> note_examen;
    private Set<NoteFinale> note_finale;

    public NoteDto(){}

    public NoteDto(int id_nota, String tip_nota, Set<NoteActivitate> note_activitate, Set<NoteExamen> note_examen, Set<NoteFinale> note_finale) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteDto noteDto = (NoteDto) o;
        return id_nota == noteDto.id_nota &&
                tip_nota.equals(noteDto.tip_nota) &&
                note_activitate.equals(noteDto.note_activitate) &&
                note_examen.equals(noteDto.note_examen) &&
                note_finale.equals(noteDto.note_finale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_nota, tip_nota, note_activitate, note_examen, note_finale);
    }
}
