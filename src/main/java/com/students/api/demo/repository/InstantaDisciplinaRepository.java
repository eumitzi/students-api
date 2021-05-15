package com.students.api.demo.repository;

import com.students.api.demo.entity.InstantaDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface InstantaDisciplinaRepository extends JpaRepository<InstantaDisciplina, Integer> {
  Optional<InstantaDisciplina> findById(int id);

//  List<InstantaDisciplina> findAllByIdAnStudiuAndIdStudent(Integer idAnStudiu, int idStudent);

  @Query("SELECT u FROM InstantaDisciplina u JOIN FETCH u.anStudiu r WHERE r.an_studiu = :an_studiu AND u.profesor=:profesor")
  InstantaDisciplina findInstantaDisciplinaById(@Param("an_studiu") String an_studiu, @Param("profesor") String profesor);
}
