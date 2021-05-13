package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstantaDisciplinaDto {

  private int id_instanta_disciplina;
  private int id_disciplina;
  private int id_profesor;
  private int id_an_universitar;
  private int nr_credite;
  private int semestru;
}
