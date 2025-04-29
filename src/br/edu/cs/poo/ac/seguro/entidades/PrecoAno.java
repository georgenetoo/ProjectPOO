package br.edu.cs.poo.ac.seguro.entidades;

public class PrecoAno {
    private int ano;
    private double preco;

    public PrecoAno(int ano, double preco) {
        this.ano = ano;
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
