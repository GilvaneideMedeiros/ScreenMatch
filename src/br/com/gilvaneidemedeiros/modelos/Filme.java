package br.com.gilvaneidemedeiros.modelos;

import br.com.gilvaneidemedeiros.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme() {
        super();
    }

    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) { this.diretor = diretor; }

    @Override
    public int getClassificacao() {
        return 0;
    }

   /* @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoLancamento() + ")";
    }*/
}
