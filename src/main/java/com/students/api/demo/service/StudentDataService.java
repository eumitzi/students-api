package com.students.api.demo.service;

import com.students.api.demo.dto.NotaCompletDto;
import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.entity.*;
import com.students.api.demo.repository.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.*;

@Component
@Transactional
public class StudentDataService {

  private StudentRepository studentRepository;
  private ProfesorRepository profesorRepository;
  private InstantaDisciplinaRepository instantaDisciplinaRepository;
  private NoteFinaleRepository noteFinaleRepository;
  private NoteActivitateRepository noteActivitateRepository;
  private NoteExamenRepository noteExamenRepository;
  private NoteRepository noteRepository;
  private AnStudiuRepository anStudiuRepository;
  private DisciplinaRepository disciplinaRepository;

  public StudentDataService(
      StudentRepository studentRepository,
      ProfesorRepository profesorRepository,
      InstantaDisciplinaRepository instantaDisciplinaRepository,
      NoteFinaleRepository noteFinaleRepository,
      AnStudiuRepository anStudiuRepository,
      NoteActivitateRepository noteActivitateRepository,
      NoteExamenRepository noteExamenRepository,
      NoteRepository noteRepository,
      DisciplinaRepository disciplinaRepository) {
    this.studentRepository = studentRepository;
    this.profesorRepository = profesorRepository;
    this.instantaDisciplinaRepository = instantaDisciplinaRepository;
    this.noteFinaleRepository = noteFinaleRepository;
    this.anStudiuRepository = anStudiuRepository;
    this.noteRepository = noteRepository;
    this.noteActivitateRepository = noteActivitateRepository;
    this.noteExamenRepository = noteExamenRepository;
    this.disciplinaRepository = disciplinaRepository;
  }

  // student/{idStudent}/note/{tipNote}/an_studiu=n
  public NotaDto getNoteForStudentByAnStudiu(
      Integer idStudent, String tipNote, Integer idAnStudiu) {

    Optional<Student> student = studentRepository.findById(idStudent);
    Optional<AnStudiu> anStudiu = anStudiuRepository.findById(idAnStudiu);
    List<InstantaDisciplina> instantaDisciplinaList =
        instantaDisciplinaRepository.findAllByStudentAndAnStudiu(student, anStudiu);

    List<Map<String, Float>> discNota = new ArrayList<>();
    switch (tipNote) {
      case "activitate":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final NotaActivitate notaActByInsDisc =
              noteActivitateRepository.findByInstantaDisciplina(instantaDisciplina);
          Map<String, Float> disNot = new HashMap<>();
          disNot.put(
              instantaDisciplina.getDisciplinaGeneral().getNume(),
              notaActByInsDisc.getValoareNota());
          discNota.add(disNot);
        }
        break;
      case "examen":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final NoteExamen notaExByInsDisc =
              noteExamenRepository.findByInstantaDisciplina(instantaDisciplina);
          Map<String, Float> disNot = new HashMap<>();
          disNot.put(
              instantaDisciplina.getDisciplinaGeneral().getNume(),
              notaExByInsDisc.getValoareNota());
          discNota.add(disNot);
        }
        break;
      case "finala":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final NoteFinale noteFinaleByInsDisc =
              noteFinaleRepository.findByInstantaDisciplina(instantaDisciplina);
          Map<String, Float> disNot = new HashMap<>();
          disNot.put(
              instantaDisciplina.getDisciplinaGeneral().getNume(),
              noteFinaleByInsDisc.getMedieFinala());
          discNota.add(disNot);
        }
        break;
    }
    return new NotaDto(discNota);
  }

  // student/{idStudent}/note?disciplina=idDisciplina
  public NotaCompletDto getNoteForStudentByDisciplina(Integer idStudent, Integer idInstDisc) {

    Optional<Student> student = studentRepository.findById(idStudent);
    final List<InstantaDisciplina> instDisByStud =
        instantaDisciplinaRepository.findAllByStudent(student);
    final NotaCompletDto notaCompletDto = new NotaCompletDto();
    for (InstantaDisciplina instantaDisciplina : instDisByStud) {
      if (instantaDisciplina.getId() == idInstDisc) {
        // this is a list
        final NoteFinale noteFinaleByInsDisc =
            noteFinaleRepository.findByInstantaDisciplina(instantaDisciplina);
        final NotaActivitate notaActByInsDisc =
            noteActivitateRepository.findByInstantaDisciplina(instantaDisciplina);
        final NoteExamen notaExByInsDisc =
            noteExamenRepository.findByInstantaDisciplina(instantaDisciplina);

        final Map<Float, String> notaActividataData = new HashMap<>();
        notaActividataData.put(notaActByInsDisc.getValoareNota(), notaActByInsDisc.getData());
        final Map<Float, String> notaExData = new HashMap<>();
        notaExData.put(notaExByInsDisc.getValoareNota(), notaExByInsDisc.getData());
        final Map<Float, String> notaFinalaData = new HashMap<>();
        notaFinalaData.put(noteFinaleByInsDisc.getMedieFinala(), noteFinaleByInsDisc.getData());

        notaCompletDto.setNotaActivitateData(notaActividataData);
        notaCompletDto.setNoteExamenData(notaExData);
        notaCompletDto.setNoteFinalaData(notaFinalaData);
      }
    }

    return notaCompletDto;
  }
}
