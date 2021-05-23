package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteActivitateRepository extends JpaRepository<NotaActivitate, Integer> {

  @Override
  Optional<NotaActivitate> findById(Integer id);

  List<NotaActivitate> findByInstantaDisciplinaAndStudent(InstantaDisciplina instantaDisciplina, Optional<Student> student);
  List<InstantaDisciplina> findByStudent(Optional<Student> student);
  List<NotaActivitate> findAllByInstantaDisciplina(InstantaDisciplina instantaDisciplina);
}
