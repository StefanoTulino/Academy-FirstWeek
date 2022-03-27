package com.corso.terzoEsercizio;

public class Paziente {
    private int numeroTess;
    private Medico m;

    public Paziente(int numeroTess, Medico m) {
        this.numeroTess = numeroTess;
        this.m = m;
    }

    public int getNumeroTess() {
        return numeroTess;
    }

    public void setNumeroTess(int numeroTess) {
        this.numeroTess = numeroTess;
    }

    public Medico getMedico() {
        return m;
    }

    public void setMedico(Medico m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Paziente con id: "+ this.numeroTess+" con medico "+this.m.getNome();
    }
}
