package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "programe_studiu")
public class ProgramaStudiu {

    @Id
    @Column(name = "id_prg_studiu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_prg_studiu;

    @Column(name= "detaliu")
    private String detaliu;


    @ManyToMany
    @JoinTable(
            name = "ciclustd_prgstd",
            joinColumns = @JoinColumn(name = "id_prg_studiu"),
            inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu"))
    private Set<CicluStudiu> cicluStudiuSet;

    public ProgramaStudiu(){

    }

    public ProgramaStudiu(int id_prg_studiu, String detaliu, Set<CicluStudiu> cicluStudiuSet) {
        this.id_prg_studiu = id_prg_studiu;
        this.detaliu = detaliu;
        this.cicluStudiuSet = cicluStudiuSet;
    }

    public int getId_prg_studiu() {
        return id_prg_studiu;
    }

    public void setId_prg_studiu(int id_prg_studiu) {
        this.id_prg_studiu = id_prg_studiu;
    }

    public String getDetaliu() {
        return detaliu;
    }

    public void setDetaliu(String detaliu) {
        this.detaliu = detaliu;
    }

    public Set<CicluStudiu> getCicluStudiuSet() {
        return cicluStudiuSet;
    }

    public void setCicluStudiuSet(Set<CicluStudiu> cicluStudiuSet) {
        this.cicluStudiuSet = cicluStudiuSet;
    }

    @Override
    public String toString() {
        return "ProgramaStudiu{" +
                "id_prg_studiu=" + id_prg_studiu +
                ", detaliu='" + detaliu + '\'' +
                ", cicluStudiuSet=" + cicluStudiuSet +
                '}';
    }
}
