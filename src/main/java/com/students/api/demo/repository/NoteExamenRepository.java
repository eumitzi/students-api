package com.students.api.demo.repository;

import com.students.api.demo.entity.NoteExamen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteExamenRepository extends JpaRepository<NoteExamen, Integer> {
  Optional<NoteExamen> findById(int idNoteExamen);
}
