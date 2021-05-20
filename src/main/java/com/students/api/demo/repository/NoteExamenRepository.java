package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.entity.NoteExamen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteExamenRepository extends JpaRepository<NoteExamen, Integer> {

  @Override
  Optional<NoteExamen> findById(Integer id);

  NoteExamen findByInstantaDisciplina(InstantaDisciplina instantaDisciplina);
}
