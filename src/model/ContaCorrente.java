package model;

import java.util.List;

public class ContaCorrente extends Conta{

    // construtor
    public ContaCorrente(int numeroConta, double saldo, Cliente cliente, List<Transacao> listaTransacoes) {
        super(numeroConta, saldo, cliente, listaTransacoes);
    }
}
