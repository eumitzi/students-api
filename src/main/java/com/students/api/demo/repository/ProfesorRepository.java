package com.students.api.demo.repository;

import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Student, Long> {

}
