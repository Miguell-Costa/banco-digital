package main;

import model.*;
import service.BancoService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();

        BancoService banco = new BancoService();

        // cliente
        Cliente c1 = new Cliente(1, "Miguel", "miguel@email.com", 123456789);
        banco.adicionarCliente(c1);

        // contas
        banco.criarContaCorrente(1001, c1);
        banco.criarContaPoupanca(2001, c1, 0.02);

        Conta cc = banco.procurarContaPorNumero(1001);
        Conta cp = banco.procurarContaPorNumero(2001);

        // operações
        cc.depositar(500);
        cc.levantar(100);
        cc.transferir(cp, 200);

        banco.aplicarJurosEmContasPoupanca();

        // mostrar saldo
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Poupança: " + cp.getSaldo());

        // mostrar transações (extrato)
        System.out.println("\n=== EXTRATO CONTA CORRENTE ===");
        for (Transacao t : cc.getListaTransacoes()) {
            System.out.println(t);
        }

        System.out.println("\n=== EXTRATO POUPANÇA ===");
        for (Transacao t : cp.getListaTransacoes()) {
            System.out.println(t);
        }
    }
}