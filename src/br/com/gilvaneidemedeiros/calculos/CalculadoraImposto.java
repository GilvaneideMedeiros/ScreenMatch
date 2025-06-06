package br.com.gilvaneidemedeiros.calculos;

public class CalculadoraImposto {

    private double totalImposto;

    public void registra(Tributavel item) {
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
