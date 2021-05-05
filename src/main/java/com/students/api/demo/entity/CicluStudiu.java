package com.students.api.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ciclu_studiu")
public class CicluStudiu {

    @Id
    @Column(name = "id_ciclu_studiu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_ciclu_studiu;

    @Column(name = "tip_ciclu_studiu")
    private String tip_ciclu_studiu;

    @ManyToMany
    @JoinTable(name = "anstd_ciclustd",
            joinColumns = @JoinColumn(name = "id_an_studiu"),
            inverseJoinColumns = @JoinColumn(name = "id_ciclu_studiu"))
    private Set<AnStudiu> anstudiu_ciclustd;


    @ManyToMany
    @JoinTable(
            name = "ciclustd_prgstd",
            joinColumns = @JoinColumn(name = "id_ciclu_studiu"),
            inverseJoinColumns = @JoinColumn(name = "id_perioada_semestru"))
    private Set<PerioadaSemestru> perioadaSemestruSet;

    public CicluStudiu(){}

    public CicluStudiu(int id_ciclu_studiu, String tip_ciclu_studiu, Set<AnStudiu> anstudiu_ciclustd, Set<PerioadaSemestru> perioadaSemestruSet) {
        this.id_ciclu_studiu = id_ciclu_studiu;
        this.tip_ciclu_studiu = tip_ciclu_studiu;
        this.anstudiu_ciclustd = anstudiu_ciclustd;
        this.perioadaSemestruSet = perioadaSemestruSet;
    }


    public String getTip_ciclu_studiu() {
        return tip_ciclu_studiu;
    }

    public void setTip_ciclu_studiu(String tip_ciclu_studiu) {
        this.tip_ciclu_studiu = tip_ciclu_studiu;
    }

    public int getId_ciclu_studiu() {
        return id_ciclu_studiu;
    }

    public void setId_ciclu_studiu(int id_ciclu_studiu) {
        this.id_ciclu_studiu = id_ciclu_studiu;
    }


    public Set<AnStudiu> getAnstudiu_ciclustd() {
        return anstudiu_ciclustd;
    }

    public void setAnstudiu_ciclustd(Set<AnStudiu> anstudiu_ciclustd) {
        this.anstudiu_ciclustd = anstudiu_ciclustd;
    }

    public Set<PerioadaSemestru> getPerioadaSemestruSet() {
        return perioadaSemestruSet;
    }

    public void setPerioadaSemestruSet(Set<PerioadaSemestru> perioadaSemestruSet) {
        this.perioadaSemestruSet = perioadaSemestruSet;
    }

    @Override
    public String toString() {
        return "CicluStudiu{" +
                "id_ciclu_studiu=" + id_ciclu_studiu +
                ", tip_ciclu_studiu='" + tip_ciclu_studiu + '\'' +
                ", anstudiu_ciclustd=" + anstudiu_ciclustd +
                ", perioadaSemestruSet=" + perioadaSemestruSet +
                '}';
    }
}
