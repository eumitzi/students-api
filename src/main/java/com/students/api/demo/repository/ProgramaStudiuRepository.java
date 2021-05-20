package com.students.api.demo.repository;

import com.students.api.demo.entity.ProgramaStudiu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgramaStudiuRepository extends JpaRepository<ProgramaStudiu, Integer> {
  @Override
  Optional<ProgramaStudiu> findById(Integer id);
}
