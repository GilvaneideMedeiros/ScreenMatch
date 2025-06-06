package br.com.gilvaneidemedeiros.modelos;

import br.com.gilvaneidemedeiros.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setVisualizacoes(int totalVisualizacoes) {

    }

    public int getNumero() { return numero; }

    public String getNome() { return nome; }

    public String getSerie() { return serie; }

    public void setNumero(int numero) { this.numero = numero; }

    public void setNome(String nome) { this.nome = nome; }

    public void setSerie(String serie) { this.serie = serie; }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {

    }
}
