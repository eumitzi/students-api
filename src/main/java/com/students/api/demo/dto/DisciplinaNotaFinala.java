package com.students.api.demo.dto;

public class DisciplinaNotaFinala {

    public String getNumeDisciplina() {
        return numeDisciplina;
    }

    public void setNumeDisciplina(String numeDisciplina) {
        this.numeDisciplina = numeDisciplina;
    }

    public float getNotaFinala() {
        return notaFinala;
    }

    public void setNotaFinala(float notaFinala) {
        this.notaFinala = notaFinala;
    }

    private String numeDisciplina;
    private float notaFinala;

    public int getAnUniversitar() {
        return anUniversitar;
    }

    public void setAnUniversitar(int anUniversitar) {
        this.anUniversitar = anUniversitar;
    }

    private int anUniversitar;
}
