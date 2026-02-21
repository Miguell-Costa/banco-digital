package service;

import exception.ContaJaExistenteException;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Cliente> listaClientes;
    private List<Conta> listaContas;

    public BancoService() {
        this.listaClientes = new ArrayList<>();
        this.listaContas = new ArrayList<>();
    }

    // adicionar um cliente
    public void adicionarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    // metodo para criar uma conta corrente
    public void criarContaCorrente(int numeroConta, Cliente cliente){

        if(contaExiste(numeroConta)){
            throw new ContaJaExistenteException("Já existe uma conta com esse numero");
        }

        Conta novaConta = new ContaCorrente(numeroConta, cliente);
        listaContas.add(novaConta);
        cliente.adicionarConta(novaConta);
    }

    // metodo para criar uma conta poupança
    public void criarContaPoupanca(int numeroConta, Cliente cliente, double juros){

        if(contaExiste(numeroConta)){
            throw new ContaJaExistenteException("Já existe uma conta com esse numero");
        }

        Conta novaConta = new ContaPoupanca(numeroConta, cliente, juros);
        listaContas.add(novaConta);
        cliente.adicionarConta(novaConta);
    }

    // proucar conta por numero
    public Conta procurarContaPorNumero(int numeroConta){
        for (Conta c: listaContas){
            if(numeroConta == c.getNumeroConta()){
                return c;
            }
        }
        return null;
    }

    // listar clientes
    public void listarClientes(){
        for (Cliente c: listaClientes){
            System.out.println(c);
        }
    }

    // metodo para verificar se conta existe
    private boolean contaExiste(int numeroConta) {
        return listaContas.stream()
                .anyMatch(c -> c.getNumeroConta() == numeroConta);
    }

    // metodo para aplicar os juros nas contas todas
    public void aplicarJurosEmContasPoupanca() {
        for (Conta c : listaContas) {
            if (c instanceof ContaPoupanca) {
                c.aplicarJuros();
            }
        }
    }
}
