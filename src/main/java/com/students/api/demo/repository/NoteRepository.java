package com.students.api.demo.repository;

import com.students.api.demo.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepository extends JpaRepository<Nota, Integer> {
  Optional<Nota> findById(Integer id);
}
