package model;

import exception.SaldoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private List<Transacao> listaTransacoes;

    // construtor
    public Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.cliente = cliente;
        this.listaTransacoes = new ArrayList<>();
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

    // metodo para levantar dinheiro
    public void levantar(double valor){
        if(saldo - valor < 0){
            throw new SaldoInsuficienteException("Saldo insufeciente");
        }
        saldo = saldo - valor;
        listaTransacoes.add(new Transacao(TipoTransacao.LEVANTAMENTO, valor));
    }

    // metodo para depositar dinheiro
    public void depositar(double valor){
        saldo = saldo + valor;
        listaTransacoes.add(new Transacao(TipoTransacao.DEPOSITO, valor));
    }

    // metodo para transferir dinheiro para outra conta
    public void transferir(Conta contaDestino, double valor){
        if(saldo - valor < 0){
            throw new SaldoInsuficienteException("Saldo insufeciente");
        }
        saldo = saldo - valor;
        contaDestino.depositar(valor);
        listaTransacoes.add(new Transacao(TipoTransacao.TRANSACAO, valor));
    }

    // metodo abstrato para calcular juros e aplicas nas contas
    public abstract void aplicarJuros();

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
