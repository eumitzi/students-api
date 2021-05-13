package com.students.api.demo.service;

import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Profesor;
import com.students.api.demo.repository.DisciplinaRepository;
import com.students.api.demo.repository.InstantaDisciplinaRepository;
import com.students.api.demo.repository.ProfesorRepository;
import com.students.api.demo.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataService {
  private final StudentRepository studentRepository;
  private final DisciplinaRepository disciplinaRepository;
  private final InstantaDisciplinaRepository instantaDisciplinaRepository;
  private final ProfesorRepository profesorRepository;

  public DataService(
      StudentRepository studentRepository,
      DisciplinaRepository disciplinaRepository,
      InstantaDisciplinaRepository instantaDisciplinaRepository,
      ProfesorRepository profesorRepository) {
    this.studentRepository = studentRepository;
    this.instantaDisciplinaRepository = instantaDisciplinaRepository;
    this.disciplinaRepository = disciplinaRepository;
    this.profesorRepository = profesorRepository;
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
}
