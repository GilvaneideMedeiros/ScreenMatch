package br.com.gilvaneidemedeiros.principal;

import br.com.gilvaneidemedeiros.calculos.Classificavel;
import br.com.gilvaneidemedeiros.calculos.FiltroRecomendacao;
import br.com.gilvaneidemedeiros.calculos.CalculadoraDeTempo;
import br.com.gilvaneidemedeiros.modelos.Episodio;
import br.com.gilvaneidemedeiros.modelos.Filme;
import br.com.gilvaneidemedeiros.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var meuFilme = new Filme();
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

        var minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(15);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setAtiva(true);
        minhaSerie.setMinutosPorEpisodio(60);

        minhaSerie.exibeFichaTecnica();
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

        var outroFilme = new Filme();
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

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Top Gun: Maverick");
        filmeDoPaulo.setAnoLancamento(2022);
        filmeDoPaulo.setDuracaoEmMinutos(130);
        filmeDoPaulo.setDiretor("Joseph Kosinski");

        filmeDoPaulo.exibeFichaTecnica();
        filmeDoPaulo.avalia(10);
        filmeDoPaulo.avalia(10);
        filmeDoPaulo.avalia(9.5);
        System.out.println("Soma das avaliações: " +filmeDoPaulo.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " +filmeDoPaulo.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " +filmeDoPaulo.pegaMedia());
        System.out.println("Diretor: " +filmeDoPaulo.getDiretor());
        System.out.println("Duração em minutos: " +filmeDoPaulo.getDuracaoEmMinutos());
        System.out.println("\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        calculadora.inclui(outroFilme);
        calculadora.inclui(filmeDoPaulo);
        System.out.println("Tempo total: " +calculadora.getTempoTotal());
        System.out.println("\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(minhaSerie);
        filtro.filtra(outroFilme);
        filtro.filtra(filmeDoPaulo);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie("Lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("\n");

        System.out.println("Classificação do meu filme: " +meuFilme.getClassificacao());
        System.out.println("Classificação da minha série: " +minhaSerie.getClassificacao());
        System.out.println("Classificação do outro filme: " +outroFilme.getClassificacao());
        System.out.println("Classificação do filme do Paulo: " +filmeDoPaulo.getClassificacao());
        System.out.println("Classificação do episódio: " +episodio.getClassificacao());
        System.out.println("\n");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista de filmes: " +listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " +listaDeFilmes.get(0).getNome());
        System.out.println("Lista de filmes: " +listaDeFilmes);
        System.out.println("toString do filme: " +listaDeFilmes.get(0).toString());
        System.out.println("\n");

        ArrayList<Serie> listaSeries = new ArrayList<>();
        listaSeries.add(minhaSerie);
        System.out.println("Tamanho da lista de séries: " +listaSeries.size());
        System.out.println("Primeira série da lista: " +listaSeries.get(0).getNome());
        System.out.println("Lista de séries: " +listaSeries);
        System.out.println("toString da série: " +listaSeries.get(0).toString());
        System.out.println("\n");
    }

}
