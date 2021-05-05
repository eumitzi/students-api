package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "instanta_disciplina")
public class InstantaDisciplina {

  @Id
  @Column(name = "id_instanta_disciplina")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_instanta_disciplina;

  @Column(name = "numar_credite")
  private int nr_credite;

  @Column(name = "semestru")
  private int semestru;

  @ManyToOne(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
  @JoinColumn(name = "id_profesor")
  private Profesor profesor;

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

  @OneToOne
  @JoinColumn(name = "id_an_universitar", referencedColumnName = "id_an_universitar")
  private AnUniversitar anUniversitar;

  @ManyToOne
  @JoinColumn(name = "id_student", nullable = false)
  private Student student_instDisc;

  public InstantaDisciplina(int id_instanta_disciplina, int nr_credite, int semestru, Profesor profesor, AnUniversitar anUniversitar, Student student_instDisc, DisciplinaGeneral disciplina_general, Set<Profesor> prof_instDisc, Set<NoteActivitate> noteActivitateSet, Set<NoteExamen> noteExamenSet, Set<NoteFinale> noteFinaleSet) {
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

  public Set<NoteActivitate> getNoteActivitateSet() {
    return noteActivitateSet;
  }

  public void setNoteActivitateSet(Set<NoteActivitate> noteActivitateSet) {
    this.noteActivitateSet = noteActivitateSet;
  }

  @ManyToOne
  @JoinColumn(name = "id_disciplina", nullable = false)
  private DisciplinaGeneral disciplina_general;

  @ManyToMany(mappedBy = "instantaDisc_prof")
  private Set<Profesor> prof_instDisc;

  @OneToMany(mappedBy = "instantaDisciplina")
  private Set<NoteActivitate> noteActivitateSet;

  @OneToMany(mappedBy = "instantaDisciplina_noteEx")
  private Set<NoteExamen> noteExamenSet;

  @OneToMany(mappedBy = "instantaDisciplina_noteFin")
  private Set<NoteFinale> noteFinaleSet;

  public InstantaDisciplina() {}

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

  @Override
  public String toString() {
    return "InstantaDisciplina{" +
            "id_instanta_disciplina=" + id_instanta_disciplina +
            ", nr_credite=" + nr_credite +
            ", semestru=" + semestru +
            ", profesor=" + profesor +
            ", anUniversitar=" + anUniversitar +
            ", student_instDisc=" + student_instDisc +
            ", disciplina_general=" + disciplina_general +
            ", prof_instDisc=" + prof_instDisc +
            ", noteActivitateSet=" + noteActivitateSet +
            ", noteExamenSet=" + noteExamenSet +
            ", noteFinaleSet=" + noteFinaleSet +
            '}';
  }

  public Set<Profesor> getProf_instDisc() {
    return prof_instDisc;
  }

  public void setProf_instDisc(Set<Profesor> prof_instDisc) {
    this.prof_instDisc = prof_instDisc;
  }

}
