package com.students.api.demo.repository;

import com.students.api.demo.entity.AnUniversitar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnUniversitarRepository extends JpaRepository<AnUniversitar, Integer> {
  // student/{idStudent}/note?an_studiu=n

  @Override
  Optional<AnUniversitar> findById(Integer id);

}
