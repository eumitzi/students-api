package com.students.api.demo.service;

import com.students.api.demo.entity.NoteFinale;
import com.students.api.demo.repository.*;

import java.util.ArrayList;
import java.util.List;

public class StudentDataService {

  private StudentRepository studentRepository;
  private ProfesorRepository profesorRepository;
  private InstantaDisciplinaRepository instantaDisciplinaRepository;
  private NoteFinaleRepository noteFinaleRepository;
  private AnStudiuRepository anStudiuRepository;

  public StudentDataService(
      StudentRepository studentRepository,
      ProfesorRepository profesorRepository,
      InstantaDisciplinaRepository instantaDisciplinaRepository,
      NoteFinaleRepository noteFinaleRepository,
      AnStudiuRepository anStudiuRepository) {
    this.studentRepository = studentRepository;
    this.profesorRepository = profesorRepository;
    this.instantaDisciplinaRepository = instantaDisciplinaRepository;
    this.noteFinaleRepository = noteFinaleRepository;
    this.anStudiuRepository = anStudiuRepository;
  }

  // student/{idStudent}/note?an_universitar=n
  private List<NoteFinale> getNoteForStudentByAnStudiu(Integer idStudent, Integer anUniversitar) {

    //    List<InstantaDisciplina> instantaDisciplinaList =
    // instantaDisciplinaRepository.findAllByIdAnStudiuAndIdStudent(idStudent, anStudiu);
    //
    //    Optional<AnStudiu> anUniversitar = anStudiuRepository.findByAn_studiu(anStudiu);
    //    for(InstantaDisciplina instantaDisciplina : instantaDisciplinaList){
    //      AnUniversitar anUniv = instantaDisciplina.getAnUniversitar();
    //      int idAnUniv = anUniv.getId();
    //      AnStudiu anStudiu = anStudiuRepository.findAnStudiuByAnUniversitar(idAnUniv);
    //    }

    //  }
    return new ArrayList<>();
  }
}
