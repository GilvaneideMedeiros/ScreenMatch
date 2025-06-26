package br.com.gilvaneidemedeiros.calculos;

import br.com.gilvaneidemedeiros.modelos.Episodio;
import br.com.gilvaneidemedeiros.modelos.Filme;
import br.com.gilvaneidemedeiros.modelos.Serie;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Serie classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
            System.out.println("\n");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
            System.out.println("\n");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
            System.out.println("\n");
        }

    }

    public void filtra(Filme classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
            System.out.println("\n");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
            System.out.println("\n");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
            System.out.println("\n");
        }
    }

    public void filtra(Episodio classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
            System.out.println("\n");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
            System.out.println("\n");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
            System.out.println("\n");
        }
    }
}


