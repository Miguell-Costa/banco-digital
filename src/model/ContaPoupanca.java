package model;

import java.util.List;

public class ContaPoupanca extends Conta{

    private double taxaJuros;

    // construtor
    public ContaPoupanca(int numeroConta, Cliente cliente, double taxaJuros) {
        super(numeroConta, cliente);
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
    public void aplicarJuros() {
        double valorJuro = getSaldo() * taxaJuros;
        depositar(valorJuro);
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupança{" +
                "taxaJuros=" + taxaJuros +
                '}';
    }
}
