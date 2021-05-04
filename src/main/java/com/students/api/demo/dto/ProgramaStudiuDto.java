package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
public class ProgramaStudiuDto {

    private int id_prg_studiu;
    private int id_ciclu_studiu;
    private String detaliu;
}
