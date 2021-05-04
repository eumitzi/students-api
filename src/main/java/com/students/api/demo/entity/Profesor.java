package com.students.api.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profesori")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {

    private int id_profesori;

    @OneToOne
    @JoinColumn(name = "id_persoana")
    private Persoane persoane;

    @OneToMany(mappedBy = "profesor",
            cascade={CascadeType.PERSIST, CascadeType.MERGE,
    CascadeType.DETACH, CascadeType.REFRESH}
    )
    private List<InstantaDisciplina> instantaDisciplinaList;

    public void add(InstantaDisciplina instantaDisciplina){
        if(instantaDisciplinaList == null){
            instantaDisciplinaList = new ArrayList<InstantaDisciplina>();
        }
        instantaDisciplinaList.add(instantaDisciplina);
        instantaDisciplina.setProfesor(this);
    }
}
