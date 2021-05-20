package com.students.api.demo.service;

import com.students.api.demo.entity.*;
import com.students.api.demo.repository.*;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
@Transactional
public class DataService {
  private final StudentRepository studentRepository;
  private final DisciplinaRepository disciplinaRepository;
  private final InstantaDisciplinaRepository instantaDisciplinaRepository;
  private final ProfesorRepository profesorRepository;
  private final AnStudiuRepository anStudiuRepository;

  public DataService(
      StudentRepository studentRepository,
      DisciplinaRepository disciplinaRepository,
      InstantaDisciplinaRepository instantaDisciplinaRepository,
      ProfesorRepository profesorRepository,
      AnStudiuRepository anStudiuRepository) {
    this.studentRepository = studentRepository;
    this.instantaDisciplinaRepository = instantaDisciplinaRepository;
    this.disciplinaRepository = disciplinaRepository;
    this.profesorRepository = profesorRepository;
    this.anStudiuRepository = anStudiuRepository;
  }

  public Optional<DisciplinaGeneral> test() {
    Optional<DisciplinaGeneral> disc = this.disciplinaRepository.findById(1);
    return disc;
  }

  public Optional<InstantaDisciplina> testInst() {
    Optional<InstantaDisciplina> disc = this.instantaDisciplinaRepository.findById(2);
    return disc;
  }

  public Optional<Profesor> testProf() {
    Optional<Profesor> disc = this.profesorRepository.findById(2);
    return disc;
  }

  public List<InstantaDisciplina> testStudent() {
    Optional<Student> student = this.studentRepository.findById(2);
    Optional<AnStudiu> anStudiu = this.anStudiuRepository.findById(2);
    List<InstantaDisciplina>  disc = this.instantaDisciplinaRepository.findAllByStudentAndAnStudiu(student, anStudiu);
    return disc;
  }
}
