package com.students.api.demo.repository;

import com.students.api.demo.entity.TipPersoane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipPersoaneRepository extends JpaRepository<TipPersoane, Long> {
  // student/{idStudent}/note?an_studiu=n

  @Override
  Optional<TipPersoane> findById(Long aLong);
}
