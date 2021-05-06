package com.students.api.demo.repository;

import com.students.api.demo.entity.DisciplinaGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisciplinaRepository extends JpaRepository<DisciplinaGeneral, Long> {
    Optional<DisciplinaGeneral> findDisciplinaGeneralById_disciplina(int id_disciplina);
}
