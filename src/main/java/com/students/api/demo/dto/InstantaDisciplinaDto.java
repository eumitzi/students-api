package com.students.api.demo.dto;

import com.students.api.demo.entity.*;

import java.util.Objects;
import java.util.Set;

public class InstantaDisciplinaDto {

    private int id_instanta_disciplina;
    private int nr_credite;
    private int semestru;
    private Profesor profesor;
    private AnUniversitar anUniversitar;
    private Student student_instDisc;
    private DisciplinaGeneral disciplina_general;
    private Set<Profesor> prof_instDisc;
    private Set<NoteActivitate> noteActivitateSet;
    private Set<NoteExamen> noteExamenSet;
    private Set<NoteFinale> noteFinaleSet;

    public InstantaDisciplinaDto(){}

    public InstantaDisciplinaDto(int id_instanta_disciplina, int nr_credite, int semestru, Profesor profesor, AnUniversitar anUniversitar, Student student_instDisc, DisciplinaGeneral disciplina_general, Set<Profesor> prof_instDisc, Set<NoteActivitate> noteActivitateSet, Set<NoteExamen> noteExamenSet, Set<NoteFinale> noteFinaleSet) {
        this.id_instanta_disciplina = id_instanta_disciplina;
        this.nr_credite = nr_credite;
        this.semestru = semestru;
        this.profesor = profesor;
        this.anUniversitar = anUniversitar;
        this.student_instDisc = student_instDisc;
        this.disciplina_general = disciplina_general;
        this.prof_instDisc = prof_instDisc;
        this.noteActivitateSet = noteActivitateSet;
        this.noteExamenSet = noteExamenSet;
        this.noteFinaleSet = noteFinaleSet;
    }

    public int getId_instanta_disciplina() {
        return id_instanta_disciplina;
    }

    public void setId_instanta_disciplina(int id_instanta_disciplina) {
        this.id_instanta_disciplina = id_instanta_disciplina;
    }

    public int getNr_credite() {
        return nr_credite;
    }

    public void setNr_credite(int nr_credite) {
        this.nr_credite = nr_credite;
    }

    public int getSemestru() {
        return semestru;
    }

    public void setSemestru(int semestru) {
        this.semestru = semestru;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public AnUniversitar getAnUniversitar() {
        return anUniversitar;
    }

    public void setAnUniversitar(AnUniversitar anUniversitar) {
        this.anUniversitar = anUniversitar;
    }

    public Student getStudent_instDisc() {
        return student_instDisc;
    }

    public void setStudent_instDisc(Student student_instDisc) {
        this.student_instDisc = student_instDisc;
    }

    public DisciplinaGeneral getDisciplina_general() {
        return disciplina_general;
    }

    public void setDisciplina_general(DisciplinaGeneral disciplina_general) {
        this.disciplina_general = disciplina_general;
    }

    public Set<Profesor> getProf_instDisc() {
        return prof_instDisc;
    }

    public void setProf_instDisc(Set<Profesor> prof_instDisc) {
        this.prof_instDisc = prof_instDisc;
    }

    public Set<NoteActivitate> getNoteActivitateSet() {
        return noteActivitateSet;
    }

    public void setNoteActivitateSet(Set<NoteActivitate> noteActivitateSet) {
        this.noteActivitateSet = noteActivitateSet;
    }

    public Set<NoteExamen> getNoteExamenSet() {
        return noteExamenSet;
    }

    public void setNoteExamenSet(Set<NoteExamen> noteExamenSet) {
        this.noteExamenSet = noteExamenSet;
    }

    public Set<NoteFinale> getNoteFinaleSet() {
        return noteFinaleSet;
    }

    public void setNoteFinaleSet(Set<NoteFinale> noteFinaleSet) {
        this.noteFinaleSet = noteFinaleSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstantaDisciplinaDto that = (InstantaDisciplinaDto) o;
        return id_instanta_disciplina == that.id_instanta_disciplina &&
                nr_credite == that.nr_credite &&
                semestru == that.semestru &&
                profesor.equals(that.profesor) &&
                anUniversitar.equals(that.anUniversitar) &&
                student_instDisc.equals(that.student_instDisc) &&
                disciplina_general.equals(that.disciplina_general) &&
                prof_instDisc.equals(that.prof_instDisc) &&
                noteActivitateSet.equals(that.noteActivitateSet) &&
                noteExamenSet.equals(that.noteExamenSet) &&
                noteFinaleSet.equals(that.noteFinaleSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_instanta_disciplina, nr_credite, semestru, profesor, anUniversitar, student_instDisc, disciplina_general, prof_instDisc, noteActivitateSet, noteExamenSet, noteFinaleSet);
    }
}
