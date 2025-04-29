package br.edu.cs.poo.ac.seguro.entidades;

import java.util.List;

public class PrecosAnosCategoria {
    private String categoria;
    private List<PrecoAno> precos;

    public PrecosAnosCategoria(String categoria, List<PrecoAno> precos) {
        this.categoria = categoria;
        this.precos = precos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<PrecoAno> getPrecos() {
        return precos;
    }

    public void setPrecos(List<PrecoAno> precos) {
        this.precos = precos;
    }
}
