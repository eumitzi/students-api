package com.students.api.demo.repository;

import com.students.api.demo.entity.NotaActivitate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteActivitateRepository extends JpaRepository<NotaActivitate, Integer> {
  Optional<NotaActivitate> findById(int idNoteActivitate);
}
