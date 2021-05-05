package com.students.api.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_finale")
public class NoteFinale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_nota_finala;

    @Column(name = "data")
    private String data;

    @Column(name = "nota_examen")
    private float nota_examen;

    @Column(name = "nota_activitate")
    private float nota_activitate;

    @Column(name = "medie_finala")
    private float medie_finala;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student", referencedColumnName = "id_student")
    private Student student_nf;

    @ManyToOne
    @JoinColumn(name = "id_instanta_disciplina", nullable = false)
    private InstantaDisciplina instantaDisciplina_noteFin;

    @ManyToOne
    @JoinColumn(name="id_nota", nullable=false)
    private Note note_noteFin;

    public NoteFinale(){}

    public NoteFinale(int id_nota_finala, String data, float nota_examen, float nota_activitate, float medie_finala, Student student_nf, InstantaDisciplina instantaDisciplina_noteFin, Note note_noteFin) {
        this.id_nota_finala = id_nota_finala;
        this.data = data;
        this.nota_examen = nota_examen;
        this.nota_activitate = nota_activitate;
        this.medie_finala = medie_finala;
        this.student_nf = student_nf;
        this.instantaDisciplina_noteFin = instantaDisciplina_noteFin;
        this.note_noteFin = note_noteFin;
    }


    public int getId_nota_finala() {
        return id_nota_finala;
    }

    public void setId_nota_finala(int id_nota_finala) {
        this.id_nota_finala = id_nota_finala;
    }


    @Override
    public String toString() {
        return "NoteFinale{" +
                "id_nota_finala=" + id_nota_finala +
                ", data='" + data + '\'' +
                ", nota_examen=" + nota_examen +
                ", nota_activitate=" + nota_activitate +
                ", medie_finala=" + medie_finala +
                ", student_nf=" + student_nf +
                ", instantaDisciplina_noteFin=" + instantaDisciplina_noteFin +
                ", note_noteFin=" + note_noteFin +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(float nota_examen) {
        this.nota_examen = nota_examen;
    }

    public float getNota_activitate() {
        return nota_activitate;
    }

    public void setNota_activitate(float nota_activitate) {
        this.nota_activitate = nota_activitate;
    }

    public float getMedie_finala() {
        return medie_finala;
    }

    public void setMedie_finala(float medie_finala) {
        this.medie_finala = medie_finala;
    }

    public Student getStudent_nf() {
        return student_nf;
    }

    public void setStudent_nf(Student student_nf) {
        this.student_nf = student_nf;
    }

    public Note getNote_noteFin() {
        return note_noteFin;
    }

    public void setNote_noteFin(Note note_noteFin) {
        this.note_noteFin = note_noteFin;
    }


    public InstantaDisciplina getInstantaDisciplina_noteFin() {
        return instantaDisciplina_noteFin;
    }

    public void setInstantaDisciplina_noteFin(InstantaDisciplina instantaDisciplina_noteFin) {
        this.instantaDisciplina_noteFin = instantaDisciplina_noteFin;
    }
}
