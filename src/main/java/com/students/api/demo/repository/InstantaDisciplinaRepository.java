package com.students.api.demo.repository;

import com.students.api.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstantaDisciplinaRepository extends JpaRepository<InstantaDisciplina, Integer> {

  @Override
  Optional<InstantaDisciplina> findById(Integer id);
  InstantaDisciplina findByIdAndStudent(Integer idDisc, Optional<Student> student);
  InstantaDisciplina findByIdAndProfesor(Integer idDisc, Optional<Profesor> profesor);

  Optional<InstantaDisciplina> findByDisciplinaGeneralAndStudent(Optional<DisciplinaGeneral> disciplinaGeneral, Optional<Student> student);
  Optional<InstantaDisciplina> findByDisciplinaGeneralAndStudent(DisciplinaGeneral disciplinaGeneral, Student student);

  List<InstantaDisciplina> findByDisciplinaGeneral (Optional<DisciplinaGeneral> disciplinaGeneral);

  List<InstantaDisciplina> findAllByStudentAndAnStudiu(Optional<Student> student, Optional<AnStudiu> anStudiu);

  List<InstantaDisciplina> findAllByStudent(Optional<Student> student);
  //  @Query("SELECT u FROM InstantaDisciplina u JOIN FETCH u.anStudiu r WHERE r.an_studiu =
  // :an_studiu AND u.profesor=:profesor")
  //  InstantaDisciplina findInstantaDisciplinaById(@Param("an_studiu") String an_studiu,
  // @Param("profesor") String profesor);
}
