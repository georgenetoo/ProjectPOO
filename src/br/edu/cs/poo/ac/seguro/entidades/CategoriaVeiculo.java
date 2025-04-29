package br.edu.cs.poo.ac.seguro.entidades;

public class CategoriaVeiculo {
    private String nome;
    private double fatorRisco;

    public CategoriaVeiculo(String nome, double fatorRisco) {
        this.nome = nome;
        this.fatorRisco = fatorRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFatorRisco() {
        return fatorRisco;
    }

    public void setFatorRisco(double fatorRisco) {
        this.fatorRisco = fatorRisco;
    }
}
