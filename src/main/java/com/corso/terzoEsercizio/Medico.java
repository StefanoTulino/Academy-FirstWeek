package com.corso.terzoEsercizio;

public class Medico {
    private String nome;

    public Medico() {
    }

    public Medico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico con nome: "+ this.nome;
    }
}
