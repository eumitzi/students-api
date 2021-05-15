package com.students.api.demo.repository;

import com.students.api.demo.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Integer> {
  @Override
  Optional<Note> findById(Integer integer);
}
