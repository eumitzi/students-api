package com.students.api.demo.repository;

import com.students.api.demo.entity.NoteFinale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteFinaleRepository extends JpaRepository<NoteFinale, Integer> {
  @Override
  Optional<NoteFinale> findById(Integer integer);

  //  @Override
  //  List<NoteFinale> findAllByStudent_nf(Integer idStudent);
}
