package com.students.api.demo.repository;

import com.students.api.demo.entity.AnStudiu;
import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstantaDisciplinaRepository extends JpaRepository<InstantaDisciplina, Integer> {

  @Override
  Optional<InstantaDisciplina> findById(Integer id);
  Optional<InstantaDisciplina> findByDisciplinaGeneral (DisciplinaGeneral disciplinaGeneral);

  List<InstantaDisciplina> findAllByStudentAndAnStudiu(Optional<Student> student, Optional<AnStudiu> anStudiu);

  //  @Query("SELECT u FROM InstantaDisciplina u JOIN FETCH u.anStudiu r WHERE r.an_studiu =
  // :an_studiu AND u.profesor=:profesor")
  //  InstantaDisciplina findInstantaDisciplinaById(@Param("an_studiu") String an_studiu,
  // @Param("profesor") String profesor);
}
