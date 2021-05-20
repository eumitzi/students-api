package com.students.api.demo.repository;

import com.students.api.demo.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

  @Override
  Optional<Profesor> findById(Integer id);
}
