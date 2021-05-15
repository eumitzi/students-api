package com.students.api.demo.repository;

import com.students.api.demo.entity.CicluStudiu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CicluStudiuRepository extends JpaRepository<CicluStudiu, Integer> {
  @Override
  Optional<CicluStudiu> findById(Integer integer);
}
