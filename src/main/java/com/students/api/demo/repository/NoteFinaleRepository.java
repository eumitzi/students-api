package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.NotaActivitate;
import com.students.api.demo.entity.NoteFinale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteFinaleRepository extends JpaRepository<NoteFinale, Integer> {
  @Override
  Optional<NoteFinale> findById(Integer id);

  NoteFinale findByInstantaDisciplina(InstantaDisciplina instantaDisciplina);
  //  @Override
  //  List<NoteFinale> findAllByStudent_nf(Integer idStudent);
}
