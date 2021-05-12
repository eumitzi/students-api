package com.students.api.demo.repository;

import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.Profesor;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

    Optional<Profesor> findProfesorById(int id);
}
