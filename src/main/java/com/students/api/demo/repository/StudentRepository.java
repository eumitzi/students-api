package com.students.api.demo.repository;

import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    //student/{idStudent}/note?an_studiu=n

    @Override
    Optional<Student> findById(Long aLong);
}
