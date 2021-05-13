package com.students.api.demo.repository;

import com.students.api.demo.entity.NoteActivitate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteActivitateRepository extends JpaRepository<NoteActivitate, Integer> {
  Optional<NoteActivitate> findById(int idNoteActivitate);
}
