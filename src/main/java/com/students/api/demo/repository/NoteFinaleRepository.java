package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.NoteFinale;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteFinaleRepository extends JpaRepository<NoteFinale, Integer> {
  @Override
  Optional<NoteFinale> findById(Integer id);

  NoteFinale findByInstantaDisciplinaOrderByDataDesc(InstantaDisciplina instantaDisciplina);
  List<NoteFinale> findByInstantaDisciplinaAndStudent(InstantaDisciplina instantaDisciplina, Optional<Student> student);
  List<NoteFinale> findAllByInstantaDisciplina(Optional<InstantaDisciplina> instantaDisciplina);
  NoteFinale findByInstantaDisciplina(InstantaDisciplina instantaDisciplina);
  //  @Override
  //  List<NoteFinale> findAllByStudent_nf(Integer idStudent);
}
