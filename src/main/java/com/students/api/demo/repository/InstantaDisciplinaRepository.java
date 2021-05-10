package com.students.api.demo.repository;

import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstantaDisciplinaRepository extends JpaRepository<InstantaDisciplina, Integer> {
    Optional<InstantaDisciplina> findInstantaDisciplinaById(int id);
//    Optional<InstantaDisciplina> findInstantaDisciplinaBy(int id);
}
