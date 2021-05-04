package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
public class CicluStudiuDto {

    private String tip_ciclu_studiu;
    private int id_ciclu_studiu;

}
