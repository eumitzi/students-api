package com.students.api.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "instanta_disciplina")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InstantaDisciplina {

    @Id
    @Column(name = "id_instanta_disciplina")
    private int id_instanta_disciplina;
    @ManyToOne
    @JoinColumn(name = "id_disciplina")

    private DisciplinaGeneral disciplinaGeneral;

    @ManyToOne(cascade ={CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;
    @OneToOne
    @JoinColumn(name = "id_an_universitar")
    private AnUniversitar anUniversitar;

    private int nr_credite;
    private int semestru;

}
