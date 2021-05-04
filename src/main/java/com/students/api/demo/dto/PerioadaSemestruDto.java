package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
public class PerioadaSemestruDto {
    private int id_perioada_semestru;
    private int numar_semestru;
    private int id_an_studiu;
    private String data_inceput;
    private String data_sfarsit;

}
