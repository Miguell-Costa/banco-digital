package model;

import java.util.List;

public class ContaPoupanca extends Conta{

    private double taxaJuros;

    // construtor
    public ContaPoupanca(int numeroConta, double saldo, Cliente cliente, List<Transacao> listaTransacoes, double taxaJuros) {
        super(numeroConta, saldo, cliente, listaTransacoes);
        this.taxaJuros = taxaJuros;
    }

    // getters e setters
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupança{" +
                "taxaJuros=" + taxaJuros +
                '}';
    }
}
