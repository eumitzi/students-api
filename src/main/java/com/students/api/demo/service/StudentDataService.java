package com.students.api.demo.service;

import com.students.api.demo.dto.NotaDto;
import com.students.api.demo.dto.NotePerDiscDto;
import com.students.api.demo.entity.*;
import com.students.api.demo.repository.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
  public List<NotaDto> getNoteForStudentByAnStudiu(
      Integer idStudent, String tipNote, Integer idAnStudiu) {

    Optional<Student> student = studentRepository.findById(idStudent);
    Optional<AnStudiu> anStudiu = anStudiuRepository.findById(idAnStudiu);
    List<InstantaDisciplina> instantaDisciplinaList =
        instantaDisciplinaRepository.findAllByStudentAndAnStudiu(student, anStudiu);


    List<NotaDto> notaDtoList = new ArrayList<>();
    switch (tipNote) {
      case "activitate":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final List<NotaActivitate> notaActivitateList =
              noteActivitateRepository.findByInstantaDisciplinaAndStudent(instantaDisciplina, student);
          NotaDto notaDto = new NotaDto();
          for (NotaActivitate notaActivitate : notaActivitateList) {
            notaDto.setData(notaActivitate.getData());
            DisciplinaGeneral disciplinaGeneral = instantaDisciplina.getDisciplinaGeneral();
            notaDto.setNumeDisc(disciplinaGeneral.getNume());
            notaDto.setValoareNota(notaActivitate.getValoareNota());
            notaDtoList.add(notaDto);
          }
        }
        break;
      case "examen":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final List<NoteExamen> noteExamenList =
              noteExamenRepository.findByInstantaDisciplinaAndStudent(instantaDisciplina, student);
          NotaDto notaDto = new NotaDto();
          for (NoteExamen noteExamen : noteExamenList) {
            notaDto.setData(noteExamen.getData());
            DisciplinaGeneral disciplinaGeneral = instantaDisciplina.getDisciplinaGeneral();
            notaDto.setNumeDisc(disciplinaGeneral.getNume());
            notaDto.setValoareNota(noteExamen.getValoareNota());
            notaDtoList.add(notaDto);
          }
        }
        break;
      case "finala":
        for (InstantaDisciplina instantaDisciplina : instantaDisciplinaList) {
          final List<NoteFinale> noteFinaleList =
              noteFinaleRepository.findByInstantaDisciplinaAndStudent(instantaDisciplina, student);
          NotaDto notaDto = new NotaDto();
          for (NoteFinale notaFinala : noteFinaleList) {
            notaDto.setData(notaFinala.getData());
            DisciplinaGeneral disciplinaGeneral = instantaDisciplina.getDisciplinaGeneral();
            notaDto.setNumeDisc(disciplinaGeneral.getNume());
            notaDto.setValoareNota(notaFinala.getMedieFinala());
            notaDtoList.add(notaDto);
          }
        }
        break;
    }
    return notaDtoList;
  }

  //  // student/{idStudent}/note?disciplina=idDisciplina
  //  public NotaCompletDto getNoteForStudentByDisciplina(Integer idStudent, Integer idInstDisc) {
  //
  //    Optional<Student> student = studentRepository.findById(idStudent);
  //    final List<InstantaDisciplina> instDisByStud =
  //        instantaDisciplinaRepository.findAllByStudent(student);
  //    final NotaCompletDto notaCompletDto = new NotaCompletDto();
  //    for (InstantaDisciplina instantaDisciplina : instDisByStud) {
  //      if (instantaDisciplina.getId() == idInstDisc) {
  //        // this is a list
  //        final NoteFinale noteFinaleByInsDisc =
  //            noteFinaleRepository.findByInstantaDisciplina(instantaDisciplina);
  //        final NotaActivitate notaActByInsDisc =
  //            noteActivitateRepository.findByInstantaDisciplina(instantaDisciplina);
  //        final NoteExamen notaExByInsDisc =
  //            noteExamenRepository.findByInstantaDisciplina(instantaDisciplina);
  //
  //        final Map<Float, String> notaActividataData = new HashMap<>();
  //        notaActividataData.put(notaActByInsDisc.getValoareNota(), notaActByInsDisc.getData());
  //        final Map<Float, String> notaExData = new HashMap<>();
  //        notaExData.put(notaExByInsDisc.getValoareNota(), notaExByInsDisc.getData());
  //        final Map<Float, String> notaFinalaData = new HashMap<>();
  //        notaFinalaData.put(noteFinaleByInsDisc.getMedieFinala(), noteFinaleByInsDisc.getData());
  //
  //        notaCompletDto.setNotaActivitateData(notaActividataData);
  //        notaCompletDto.setNoteExamenData(notaExData);
  //        notaCompletDto.setNoteFinalaData(notaFinalaData);
  //      }
  //    }
  //
  //    return notaCompletDto;
  //  }

  // student/{idStudent}/note?disciplina=idDisciplina
  public List<NotePerDiscDto> getNotePerDisc(Integer idStudent, Integer idInstDisc) {

    Optional<Student> student = studentRepository.findById(idStudent);
    InstantaDisciplina instantaDisciplina =
        instantaDisciplinaRepository.findByIdAndStudent(idInstDisc, student);

    final List<NotePerDiscDto> notePerDiscDtoList = new ArrayList<>();

    final List<NoteFinale> noteFinaleByInsDisc =
        noteFinaleRepository.findAllByInstantaDisciplina(instantaDisciplina);
    final List<NotaActivitate> notaActByInsDisc =
        noteActivitateRepository.findAllByInstantaDisciplina(instantaDisciplina);
    final List<NoteExamen> notaExByInsDisc =
        noteExamenRepository.findAllByInstantaDisciplina(instantaDisciplina);

    for (NoteFinale notaFinala : noteFinaleByInsDisc) {
      NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
      notePerDiscDto.setData(notaFinala.getData());
      notePerDiscDto.setValoareNota(notaFinala.getMedieFinala());
      notePerDiscDto.setTipNota("NotaFinala");
      notePerDiscDtoList.add(notePerDiscDto);
    }
    for (NoteExamen notaEx : notaExByInsDisc) {
      NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
      notePerDiscDto.setData(notaEx.getData());
      notePerDiscDto.setValoareNota(notaEx.getValoareNota());
      notePerDiscDto.setTipNota("NotaExamen");
      notePerDiscDtoList.add(notePerDiscDto);
    }
    for (NotaActivitate notaFinala : notaActByInsDisc) {
      NotePerDiscDto notePerDiscDto = new NotePerDiscDto();
      notePerDiscDto.setData(notaFinala.getData());
      notePerDiscDto.setValoareNota(notaFinala.getValoareNota());
      notePerDiscDto.setTipNota("NotaActivitate");
      notePerDiscDtoList.add(notePerDiscDto);
    }

    return notePerDiscDtoList;
  }
}
