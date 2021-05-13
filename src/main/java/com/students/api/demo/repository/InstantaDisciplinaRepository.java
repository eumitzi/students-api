package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstantaDisciplinaRepository extends JpaRepository<InstantaDisciplina, Integer> {
  Optional<InstantaDisciplina> findById(int id);

//  List<InstantaDisciplina> findAllByIdAnStudiuAndIdStudent(Integer idAnStudiu, int idStudent);
}
