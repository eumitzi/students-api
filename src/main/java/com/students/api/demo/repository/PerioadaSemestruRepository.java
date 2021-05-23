package com.students.api.demo.repository;

import com.students.api.demo.entity.PerioadaSemestru;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerioadaSemestruRepository extends JpaRepository<PerioadaSemestru, Integer> {
  @Override
  Optional<PerioadaSemestru> findById(Integer id);
}
