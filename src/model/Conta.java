package model;

import java.util.List;

public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private List<Transacao> listaTransacoes;

    // construtor
    public Conta(int numeroConta, double saldo, Cliente cliente, List<Transacao> listaTransacoes) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.listaTransacoes = listaTransacoes;
    }

    // getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transacao> getListaTransacoes() {
        return listaTransacoes;
    }

    public void setListaTransacoes(List<Transacao> listaTransacoes) {
        this.listaTransacoes = listaTransacoes;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", listaTransacoes=" + listaTransacoes +
                '}';
    }
}
