package br.com.gilvaneidemedeiros;

import br.com.gilvaneidemedeiros.calculos.FiltroRecomendacao;
import br.com.gilvaneidemedeiros.calculos.CalculadoraDeTempo;
import br.com.gilvaneidemedeiros.modelos.Episodio;
import br.com.gilvaneidemedeiros.modelos.Filme;
import br.com.gilvaneidemedeiros.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        System.out.println("\n");
        meuFilme.setNome("Matrix");
        meuFilme.setAnoLancamento(1999);
        meuFilme.setDuracaoEmMinutos(136);
        meuFilme.setDiretor("Lana Wachowski");
        System.out.println("Duração do filme em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: " +meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
        System.out.println("Diretor: " +meuFilme.getDiretor());
        System.out.println("Duração em minutos: " +meuFilme.getDuracaoEmMinutos());
        System.out.println("\n");

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(15);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(60);

        minhaSerie.avalia(9);
        minhaSerie.avalia(7);
        minhaSerie.avalia(10);
        System.out.println("Soma das avaliações: " +minhaSerie.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +minhaSerie.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " +minhaSerie.pegaMedia());
        System.out.println("Quantidade de temporadas: " +minhaSerie.getTemporadas());
        System.out.println("Quantidade de episódios por temporada: " +minhaSerie.getEpisodiosPorTemporada());
        System.out.println("A série está ativa? ");
            if (minhaSerie.isAtiva()) {
                System.out.println("Sim");
                } else {
                System.out.println("Não");
            }
        System.out.println("Quantidade de minutos por episódio: " +minhaSerie.getMinutosPorEpisodio());
        System.out.println("Duração para maratonar Lost: " +minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        System.out.println("\n");
        outroFilme.setNome("A Paixão de Cristo");
        outroFilme.setAnoLancamento(2004);
        outroFilme.setDuracaoEmMinutos(127);
        outroFilme.setDiretor("Mel Gibson");

        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(10);
        outroFilme.avalia(10);
        outroFilme.avalia(10);
        System.out.println("Soma das avaliações: " +outroFilme.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +outroFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " +outroFilme.pegaMedia());
        System.out.println("Diretor: " +outroFilme.getDiretor());
        System.out.println("Duração em minutos: " +outroFilme.getDuracaoEmMinutos());
        System.out.println("\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        calculadora.inclui(outroFilme);
        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("Lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }

}
