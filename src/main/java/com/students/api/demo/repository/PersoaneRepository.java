package com.students.api.demo.repository;

import com.students.api.demo.entity.Persoane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersoaneRepository extends JpaRepository<Persoane, Integer> {
  @Override
  Optional<Persoane> findById(Integer integer);
}
