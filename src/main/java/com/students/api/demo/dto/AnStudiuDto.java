package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnStudiuDto {
    private int id_an_studiu;
    private int an_studiu;
    private String data_inceput;
    private String data_sfarsit;
    private int id_ciclu_studiu;
    private int id_an_universitar;
}
