package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "an_studiu")

public class AnStudiu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_an_studiu;
    private int an_studiu;
    private String data_inceput;
    private String data_sfarsit;
    private int id_ciclu_studiu;
    private int id_an_universitar;

    @ManyToMany(mappedBy = "anstudiu_ciclustd")
    Set<CicluStudiu> ciclustd_anstudiu;

}
