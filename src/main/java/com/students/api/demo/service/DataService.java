package com.students.api.demo.service;

import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.repository.DisciplinaRepository;
import com.students.api.demo.repository.InstantaDisciplinaRepository;
import com.students.api.demo.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataService {
  private final StudentRepository studentRepository;
  private final DisciplinaRepository disciplinaRepository;
  private final InstantaDisciplinaRepository instantaDisciplinaRepository;

  public DataService(StudentRepository studentRepository, DisciplinaRepository disciplinaRepository,
                     InstantaDisciplinaRepository instantaDisciplinaRepository) {
    this.studentRepository = studentRepository;
    this.instantaDisciplinaRepository=instantaDisciplinaRepository;
    this.disciplinaRepository = disciplinaRepository;
  }

  public Optional<DisciplinaGeneral> test(){
    Optional<DisciplinaGeneral> disc = this.disciplinaRepository.findDisciplinaGeneralById(1);
    return disc;
  }

  public Optional<InstantaDisciplina> testInst(){
    Optional<InstantaDisciplina> disc = this.instantaDisciplinaRepository.findInstantaDisciplinaById(2);
    return disc;
  }

}
