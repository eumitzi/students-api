package com.students.api.demo.dto;

import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.entity.Persoana;

import java.util.List;
import java.util.Set;

public class ProfesoriDto {
  private int id_profesori;
  private Set<InstantaDisciplina> instantaDisc_prof;
  private Persoana persoana_prof;
  private List<InstantaDisciplina> instantaDisciplinaList;
}
