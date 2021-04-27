package com.students.api.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
public class PersoaneDto {
    private int id_persoana;
    private int id_tip_persoana;
    private String nume;
    private String prenume;
    private String adresa;

}


