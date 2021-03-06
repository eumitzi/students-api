package com.students.api.demo.repository;

import com.students.api.demo.entity.Persoana;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

  Optional<Student> findById(Integer id);
  Optional<Student> findStudentByPersoana(Optional<Persoana> pers);
  Optional<Student> findByNrMatricol (String nrMatricol);
}
