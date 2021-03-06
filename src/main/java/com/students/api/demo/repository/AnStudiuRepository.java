package com.students.api.demo.repository;

import com.students.api.demo.entity.AnStudiu;
import com.students.api.demo.entity.InstantaDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnStudiuRepository extends JpaRepository<AnStudiu, Integer> {
  @Override
  Optional<AnStudiu> findById(Integer id);

  //  Optional<AnStudiu> findByAn_studiu(Integer an_studiu);

}
