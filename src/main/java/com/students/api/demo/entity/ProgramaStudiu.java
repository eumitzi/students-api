package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "programe_studiu")
public class ProgramaStudiu {

    @Id
    @Column(name = "id_programe_studiu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name= "detaliu_program_studiu")
    private String detaliu;

    @ManyToMany
    @JoinTable(
            name = "ciclustd_prgstd",
            joinColumns = @JoinColumn(name = "id_programe_studiu"),
            inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu"))
    private Set<CicluStudiu> cicluStudiuSet;

    public ProgramaStudiu(){

    }

    public ProgramaStudiu(int id, String detaliu, Set<CicluStudiu> cicluStudiuSet) {
        this.id = id;
        this.detaliu = detaliu;
        this.cicluStudiuSet = cicluStudiuSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_prg_studiu) {
        this.id = id_prg_studiu;
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
                "id_prg_studiu=" + id +
                ", detaliu='" + detaliu + '\'' +
                ", cicluStudiuSet=" + cicluStudiuSet +
                '}';
    }
}
