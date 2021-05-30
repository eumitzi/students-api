package com.students.api.demo.service;

import com.students.api.demo.entity.*;
import com.students.api.demo.repository.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class NoteExamenService {

  //    / POST /profesor/{idProfesor}/note

  private StudentRepository studentRepository;
  private ProfesorRepository profesorRepository;
  private InstantaDisciplinaRepository instantaDisciplinaRepository;
  private NoteFinaleRepository noteFinaleRepository;
  private NoteActivitateRepository noteActivitateRepository;
  private NoteExamenRepository noteExamenRepository;
  private NoteRepository noteRepository;
  private AnStudiuRepository anStudiuRepository;
  private DisciplinaRepository disciplinaRepository;
  private PersoaneRepository persoaneRepository;
  private TipPersoaneRepository tipPersoaneRepository;

  public NoteExamenService(
      StudentRepository studentRepository,
      ProfesorRepository profesorRepository,
      InstantaDisciplinaRepository instantaDisciplinaRepository,
      NoteFinaleRepository noteFinaleRepository,
      AnStudiuRepository anStudiuRepository,
      NoteActivitateRepository noteActivitateRepository,
      NoteExamenRepository noteExamenRepository,
      NoteRepository noteRepository,
      DisciplinaRepository disciplinaRepository,
      PersoaneRepository persoaneRepository,
      TipPersoaneRepository tipPersoaneRepository) {
    this.studentRepository = studentRepository;
    this.profesorRepository = profesorRepository;
    this.instantaDisciplinaRepository = instantaDisciplinaRepository;
    this.noteFinaleRepository = noteFinaleRepository;
    this.anStudiuRepository = anStudiuRepository;
    this.noteRepository = noteRepository;
    this.noteActivitateRepository = noteActivitateRepository;
    this.noteExamenRepository = noteExamenRepository;
    this.disciplinaRepository = disciplinaRepository;
    this.persoaneRepository = persoaneRepository;
    this.tipPersoaneRepository = tipPersoaneRepository;
  }

  public void insertNoteExamen(
      String data, float valoareNota, String nrMatricol, String numeDisciplina) {
    NoteExamen notaExamen = new NoteExamen();
    Student student = studentRepository.findByNrMatricol(nrMatricol).orElse(null);
    Nota nota = noteRepository.findById(3).orElse(null);
    final DisciplinaGeneral disciplina =
        disciplinaRepository.findDisciplinaGeneralByNume(numeDisciplina).orElse(null);
    final InstantaDisciplina instantaDisciplina = instantaDisciplinaRepository.findByDisciplinaGeneralAndStudent(disciplina, student).orElse(null);

    notaExamen.setData(data);
    notaExamen.setValoareNota(valoareNota);
    notaExamen.setStudent(student);
    notaExamen.setInstantaDisciplina(instantaDisciplina);
    notaExamen.setNota(nota);

    noteExamenRepository.save(notaExamen);
  }
}
