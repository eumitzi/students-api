package com.students.api.demo.repository;

import com.students.api.demo.entity.Persoana;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersoaneRepository extends JpaRepository<Persoana, Integer> {
  @Override
  Optional<Persoana> findById(Integer id);
  Optional<Persoana> findByNumeAndPrenume(String nume, String prenume);
  Optional<Persoana> findByAdresa(String adresa);

}
