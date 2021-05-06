package com.students.api.demo.dto;

import com.students.api.demo.entity.Note;
import com.students.api.demo.entity.Student;

import java.util.Objects;

public class NoteActivitateDto {

    private int id_nota_activitate;
    private String data;
    private int id_instanta_disciplina;
    private float nota;
    private Student student_noteAc;
    private Note note_noteAc;

    public NoteActivitateDto(){}

    public NoteActivitateDto(int id_nota_activitate, String data, int id_instanta_disciplina, float nota, Student student_noteAc, Note note_noteAc) {
        this.id_nota_activitate = id_nota_activitate;
        this.data = data;
        this.id_instanta_disciplina = id_instanta_disciplina;
        this.nota = nota;
        this.student_noteAc = student_noteAc;
        this.note_noteAc = note_noteAc;
    }

    public int getId_nota_activitate() {
        return id_nota_activitate;
    }

    public void setId_nota_activitate(int id_nota_activitate) {
        this.id_nota_activitate = id_nota_activitate;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId_instanta_disciplina() {
        return id_instanta_disciplina;
    }

    public void setId_instanta_disciplina(int id_instanta_disciplina) {
        this.id_instanta_disciplina = id_instanta_disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Student getStudent_noteAc() {
        return student_noteAc;
    }

    public void setStudent_noteAc(Student student_noteAc) {
        this.student_noteAc = student_noteAc;
    }

    public Note getNote_noteAc() {
        return note_noteAc;
    }

    public void setNote_noteAc(Note note_noteAc) {
        this.note_noteAc = note_noteAc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteActivitateDto that = (NoteActivitateDto) o;
        return id_nota_activitate == that.id_nota_activitate &&
                id_instanta_disciplina == that.id_instanta_disciplina &&
                Float.compare(that.nota, nota) == 0 &&
                data.equals(that.data) &&
                student_noteAc.equals(that.student_noteAc) &&
                note_noteAc.equals(that.note_noteAc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_nota_activitate, data, id_instanta_disciplina, nota, student_noteAc, note_noteAc);
    }
}
