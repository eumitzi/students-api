package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
public class DisciplinaGeneralDto {

    private int id_disciplina;
    private String nume;

}
