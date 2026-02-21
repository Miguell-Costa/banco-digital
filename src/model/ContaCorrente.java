package model;

public class ContaCorrente extends Conta{

    // construtor
    public ContaCorrente(int numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    // não faz nada
    @Override
    public void aplicarJuros() {

    }


}
