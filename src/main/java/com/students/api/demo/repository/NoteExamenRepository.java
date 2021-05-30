package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.entity.NoteExamen;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteExamenRepository extends JpaRepository<NoteExamen, Integer> {

  @Override
  Optional<NoteExamen> findById(Integer id);

  List<NoteExamen> findByInstantaDisciplinaAndStudent(InstantaDisciplina instantaDisciplina, Optional<Student> student);
  List<NoteExamen> findAllByInstantaDisciplina(Optional<InstantaDisciplina> instantaDisciplina);

  @Override
  NoteExamen save(NoteExamen notaExamen);
}
