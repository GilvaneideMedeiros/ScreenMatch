package br.com.gilvaneidemedeiros.modelos;

import br.com.gilvaneidemedeiros.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public Filme() {
        return;
    }

    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) { this.diretor = diretor; }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 3;
    }

   @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoLancamento() + ")";
    }
}
