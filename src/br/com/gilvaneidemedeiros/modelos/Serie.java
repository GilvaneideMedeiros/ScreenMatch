package br.com.gilvaneidemedeiros.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    private int totalVisualizacoes;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() { return temporadas; }

    public int getEpisodiosPorTemporada() { return episodiosPorTemporada; }

    public boolean isAtiva() { return ativa; }

    public int getMinutosPorEpisodio() { return minutosPorEpisodio; }

    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { this.episodiosPorTemporada = episodiosPorTemporada; }

    public void setAtiva(boolean ativa){ this.ativa = ativa; }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) { this.minutosPorEpisodio = minutosPorEpisodio; }

    @Override
    public int getDuracaoEmMinutos() {
        return (temporadas * episodiosPorTemporada * minutosPorEpisodio);
    }

    public int getClassificacao() {
        return (int)pegaMedia() / 3;
    }

    @Override
    public String toString() {
        return "Série: " + getNome() + " (" + getAnoLancamento() + ")";
    }
}




