package com.students.api.demo.repository;

import com.students.api.demo.entity.TipPersoana;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipPersoaneRepository extends JpaRepository<TipPersoana, Long> {
  // student/{idStudent}/note?an_studiu=n

  @Override
  Optional<TipPersoana> findById(Long aLong);
}
